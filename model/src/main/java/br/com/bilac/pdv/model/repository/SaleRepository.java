package br.com.bilac.pdv.model.repository;

import br.com.bilac.pdv.model.entity.Sale;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<Sale, Long> {
}
