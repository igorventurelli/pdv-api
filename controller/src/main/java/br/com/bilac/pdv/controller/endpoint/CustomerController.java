package br.com.bilac.pdv.controller.endpoint;

import br.com.bilac.pdv.controller.wrapper.customer.ListCustomerWrapper;
import br.com.bilac.pdv.controller.wrapper.customer.SingleCustomerWrapper;
import br.com.bilac.pdv.service.service.CustomerSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/customers")
public class CustomerController {

    private final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerSerivce serivce;

    @GetMapping("/")
    public ListCustomerWrapper findAll() {
        logger.info("Recebi requisição /rest/customers/");
        return new ListCustomerWrapper(serivce.findAll());
    }

    @GetMapping("/{customerId}")
    public SingleCustomerWrapper findOne(@PathVariable("customerId") final Long customerId) {
        logger.info(String.format("Recebi requisição /rest/customers/%s", customerId));
        return new SingleCustomerWrapper(serivce.findById(customerId));
    }
}
