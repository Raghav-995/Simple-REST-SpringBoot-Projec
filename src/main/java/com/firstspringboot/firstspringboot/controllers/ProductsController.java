package com.firstspringboot.firstspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringboot.firstspringboot.models.ProductsModel;
import com.firstspringboot.firstspringboot.services.ProductService;


@RestController
public class ProductsController {
    @Autowired
    private ProductService services;
    @GetMapping("/products")
    public List<ProductsModel> getProducts(){
        return services.getAllProducts();
    }

    @GetMapping("/products/{id}")
    // @PathVariable int id
    public ProductsModel getProductById(@PathVariable int id){
        return services.getProductById(id);
    }

    @PostMapping("/products")
    public ProductsModel addProduct(@RequestBody ProductsModel product){
        return services.addProduct(product);
    }
    
    @PutMapping("/products")
    public ProductsModel updateProduct(@RequestBody ProductsModel product){
        return services.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        return services.deleteProduct(id);
    }
}
