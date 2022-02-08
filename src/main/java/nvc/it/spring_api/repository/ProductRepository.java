package nvc.it.spring_api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.spring_api.model.Product;

public interface ProductRepository  extends MongoRepository<Product, String>{
    public List<Product> findByNameContaining(String name);
}
