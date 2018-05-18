package br.com.bilac.pdv.controller.wrapper.customer;

import br.com.bilac.pdv.dto.dto.CustomerDTO;
import lombok.Value;

import java.util.List;

@Value
public class ListCustomerWrapper {

    private List<CustomerDTO> customers;
}
