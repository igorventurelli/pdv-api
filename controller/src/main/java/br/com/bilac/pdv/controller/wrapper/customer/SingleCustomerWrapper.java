package br.com.bilac.pdv.controller.wrapper.customer;

import br.com.bilac.pdv.dto.dto.CustomerDTO;
import lombok.Value;

@Value
public class SingleCustomerWrapper {

    private CustomerDTO customer;
}
