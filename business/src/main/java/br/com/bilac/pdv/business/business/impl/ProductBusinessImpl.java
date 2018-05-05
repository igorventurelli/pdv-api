package br.com.bilac.pdv.business.business.impl;

import br.com.bilac.pdv.business.business.ProductBusiness;
import br.com.bilac.pdv.business.exception.ResourceNotFoundException;
import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.model.entity.Product;
import br.com.bilac.pdv.model.repository.ProductsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductBusinessImpl implements ProductBusiness {

    @Autowired
    private ProductsRepository repository;

    private ModelMapper mapper;

    public ProductBusinessImpl() {
        mapper = new ModelMapper();
    }

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> dtos = new ArrayList<>();

        repository.findAll().forEach(
                product -> dtos.add(mapper.map(product, ProductDTO.class)));

        return dtos;
    }

    @Override
    public ProductDTO findById(final String productId) {
        Product product = repository.findOne(productId);
        if(product == null) throw new ResourceNotFoundException();

        ProductDTO dto = mapper.map(product, ProductDTO.class);
        return dto;
    }
}
