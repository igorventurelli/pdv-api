package br.com.bilac.pdv.service.service;

import br.com.bilac.pdv.dto.dto.CustomerDTO;

import java.util.List;

public interface CustomerSerivce {

    List<CustomerDTO> findAll();
    CustomerDTO findById(final Long id);
}
