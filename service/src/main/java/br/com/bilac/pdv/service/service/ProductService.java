package br.com.bilac.pdv.service.service;

import br.com.bilac.pdv.dto.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findAll();

    ProductDTO findById(final String productId);
}
