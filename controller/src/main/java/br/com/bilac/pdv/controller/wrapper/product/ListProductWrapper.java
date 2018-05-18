package br.com.bilac.pdv.controller.wrapper.product;

import br.com.bilac.pdv.dto.dto.ProductDTO;
import lombok.Value;

import java.util.List;

@Value
public class ListProductWrapper {

    private List<ProductDTO> products;
}
