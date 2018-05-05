package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.dto.dto.CustomerDTO;
import br.com.bilac.pdv.service.service.CustomerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/customers")
public class CustomerController {

    @Autowired
    private CustomerSerivce serivce;

    @GetMapping("/")
    private List<CustomerDTO> findAll() {
        return serivce.findAll();
    }

    @GetMapping("/{customerId}")
    private CustomerDTO findOne(@PathVariable("customerId") final Long customerId) {
        return serivce.findById(customerId);
    }
}
