package br.com.bilac.pdv.model.repository;

import br.com.bilac.pdv.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Product, String> {

}
