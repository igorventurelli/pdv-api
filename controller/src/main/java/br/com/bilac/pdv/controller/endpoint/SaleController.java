package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.dto.dto.SaleDTO;
import br.com.bilac.pdv.service.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void sell(@RequestBody SaleDTO saleDTO) {
        service.sell(saleDTO);
    }
}
