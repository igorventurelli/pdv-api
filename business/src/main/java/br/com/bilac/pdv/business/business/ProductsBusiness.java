package br.com.bilac.pdv.business.business;

import br.com.bilac.pdv.dto.dto.ProductDTO;

public interface ProductsBusiness {

    ProductDTO getProductByCode(final String barcode);
}
