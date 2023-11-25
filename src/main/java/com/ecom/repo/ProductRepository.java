package com.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
//http://localhost:8080/products-->Get and Post
//http://localhost:8080/products/id-->GetById,update,delete
