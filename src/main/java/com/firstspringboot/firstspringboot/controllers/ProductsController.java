package com.firstspringboot.firstspringboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstspringboot.firstspringboot.models.ProductsModel;
import com.firstspringboot.firstspringboot.services.ProductService;

@RestController
public class ProductsController {
    @Autowired
    private ProductService services;
    @RequestMapping("/products")
    public List<ProductsModel> getProducts(){
        return services.getAllProducts();
    }

}
