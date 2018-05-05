package br.com.bilac.pdv.business.business.impl;

import br.com.bilac.pdv.business.business.CustomerBusiness;
import br.com.bilac.pdv.business.exception.ResourceNotFoundException;
import br.com.bilac.pdv.dto.dto.CustomerDTO;
import br.com.bilac.pdv.model.entity.Customer;
import br.com.bilac.pdv.model.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerBusinessImpl implements CustomerBusiness {

    @Autowired
    private CustomerRepository repository;

    private ModelMapper mapper = new ModelMapper();

    @Override
    public List<CustomerDTO> findAll() {
        List<CustomerDTO> dtos = new ArrayList<>();
        repository.findAll().forEach(
                customer -> dtos.add(
                        mapper.map(customer, CustomerDTO.class))
        );

        return dtos;
    }

    @Override
    public CustomerDTO findById(final Long id) {
        Customer customer = repository.findOne(id);
        if(customer == null) throw new ResourceNotFoundException();

        return mapper.map(customer, CustomerDTO.class);
    }
}
