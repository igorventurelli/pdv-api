package br.com.bilac.pdv.business.business.impl;

import br.com.bilac.pdv.business.business.ProductsBusiness;
import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.model.entity.Product;
import br.com.bilac.pdv.model.repository.ProductsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductsBusinessImpl implements ProductsBusiness {

    @Autowired
    private ProductsRepository repository;

    private ModelMapper mapper;

    public ProductsBusinessImpl() {
        mapper = new ModelMapper();
    }

    @Override
    public ProductDTO getProductByCode(final String barcode) {
        Product product = repository.findByBarcode(barcode);
        ProductDTO dto = mapper.map(product, ProductDTO.class);
        return dto;
    }
}
