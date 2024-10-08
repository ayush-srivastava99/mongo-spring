package com.ayush.mongodemo.repository;

import com.ayush.mongodemo.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
