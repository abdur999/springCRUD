package com.spring.crud.repository;

import com.spring.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public  Product findByName(String name);
}
