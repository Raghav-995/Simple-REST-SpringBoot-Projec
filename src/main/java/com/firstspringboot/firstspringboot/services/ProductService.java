package com.firstspringboot.firstspringboot.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.firstspringboot.firstspringboot.models.ProductsModel;

@Service
public class ProductService {
    
    List<ProductsModel> products = Arrays.asList(
        new ProductsModel("Raghav","Full Stack Developer",12.4,12,"Hello image"),
        new ProductsModel("Raghav", "Full Stack Developer", 12.4, 12, "Hello image"),
        new ProductsModel("Raghav", "Full Stack Developer", 12.4, 12, "Hello image"),
        new ProductsModel("Raghav", "Full Stack Developer", 12.4, 12, "Hello image")
        );
    public List<ProductsModel> getAllProducts() {
        return products;
    }
}
