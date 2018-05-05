package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.dto.dto.ProductDTO;
import br.com.bilac.pdv.service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public List<ProductDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/{productId}")
    public ProductDTO findOne(@PathVariable("productId") final String productId) {
        return service.findById(productId);
    }

    @PostMapping("/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody ProductDTO dto) {
        System.out.println("criado");
    }
}
