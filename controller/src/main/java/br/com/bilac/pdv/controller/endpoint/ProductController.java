package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.controller.wrapper.product.ListProductWrapper;
import br.com.bilac.pdv.controller.wrapper.product.SingleProductWrapper;
import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.service.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/products")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public ListProductWrapper findAll() {
        logger.info("Recebi requisição /rest/products/");
        return new ListProductWrapper(service.findAll());
    }

    @GetMapping("/{productId}")
    public SingleProductWrapper findOne(@PathVariable("productId") final String productId) {
        logger.info(String.format("Recebi requisição /rest/products/%s", productId));
        return new SingleProductWrapper(service.findById(productId));
    }
}
