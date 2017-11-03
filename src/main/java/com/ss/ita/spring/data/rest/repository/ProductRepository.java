package com.ss.ita.spring.data.rest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ss.ita.spring.data.rest.document.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
