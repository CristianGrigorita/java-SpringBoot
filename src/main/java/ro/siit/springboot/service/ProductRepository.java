package ro.siit.springboot.service;

import org.springframework.data.repository.CrudRepository;
import ro.siit.springboot.model.Product;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
}
