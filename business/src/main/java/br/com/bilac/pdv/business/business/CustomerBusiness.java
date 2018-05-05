package br.com.bilac.pdv.business.business;

import br.com.bilac.pdv.dto.dto.CustomerDTO;

import java.util.List;

public interface CustomerBusiness {

    List<CustomerDTO> findAll();
    CustomerDTO findById(final Long id);
}
