package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.service.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/products")
public class ProductsController {

    @Autowired
    private ProductsService service;

    @GetMapping("/{barcode}")
    public ProductDTO getProductByCode(@PathVariable("barcode") final String barcode) {
        return service.getProductByCode(barcode);
    }
}
