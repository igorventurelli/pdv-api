package br.com.bilac.pdv.service.service;

import br.com.bilac.pdv.dto.dto.ProductDTO;

public interface ProductsService {

    ProductDTO getProductByCode(final String barcode);
}
