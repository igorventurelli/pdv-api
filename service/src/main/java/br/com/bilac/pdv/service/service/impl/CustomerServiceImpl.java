package br.com.bilac.pdv.service.service.impl;

import br.com.bilac.pdv.business.business.CustomerBusiness;
import br.com.bilac.pdv.dto.dto.CustomerDTO;
import br.com.bilac.pdv.service.service.CustomerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerSerivce {

    @Autowired
    private CustomerBusiness business;

    @Override
    public List<CustomerDTO> findAll() {
        return business.findAll();
    }

    @Override
    public CustomerDTO findById(final Long id) {
        return business.findById(id);
    }
}
