package com.firstspringboot.firstspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstspringboot.firstspringboot.models.ProductsModel;

public interface ProductRepo extends JpaRepository<ProductsModel, Integer> {
    
}
