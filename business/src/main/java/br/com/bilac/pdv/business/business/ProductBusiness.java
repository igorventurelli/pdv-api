package br.com.bilac.pdv.business.business;

import br.com.bilac.pdv.dto.dto.ProductDTO;

import java.util.List;

public interface ProductBusiness {

    List<ProductDTO> findAll();

    ProductDTO findById(final String productId);
}
