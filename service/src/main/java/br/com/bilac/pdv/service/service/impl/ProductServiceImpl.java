package br.com.bilac.pdv.service.service.impl;

import br.com.bilac.pdv.business.business.ProductBusiness;
import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductBusiness business;

    @Override
    public List<ProductDTO> findAll() {
        return business.findAll();
    }

    @Override
    public ProductDTO findById(final String productId) {
        return business.findById(productId);
    }
}
