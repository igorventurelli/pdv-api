package br.com.bilac.pdv.service.service.impl;

import br.com.bilac.pdv.business.business.ProductsBusiness;
import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.service.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsBusiness business;

    @Override
    public ProductDTO getProductByCode(final String barcode) {
        return business.getProductByCode(barcode);
    }
}
