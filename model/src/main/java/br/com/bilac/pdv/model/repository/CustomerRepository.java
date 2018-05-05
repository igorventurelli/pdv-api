package br.com.bilac.pdv.model.repository;

import br.com.bilac.pdv.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
