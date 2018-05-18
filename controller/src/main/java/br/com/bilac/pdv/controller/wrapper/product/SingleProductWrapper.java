package br.com.bilac.pdv.controller.wrapper.product;

import br.com.bilac.pdv.dto.dto.ProductDTO;
import lombok.Value;

@Value
public class SingleProductWrapper {

    private ProductDTO product;
}
