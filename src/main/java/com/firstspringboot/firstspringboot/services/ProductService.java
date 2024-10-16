package com.firstspringboot.firstspringboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstspringboot.firstspringboot.models.ProductsModel;
import com.firstspringboot.firstspringboot.repository.ProductRepo;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepo repo;
    // List<ProductsModel> products = new ArrayList<>( Arrays.asList(
    //     new ProductsModel(0, "Raghav","Full Stack Developer",12.4,122,"Hello Raghav"),
    //     new ProductsModel(1,"Sai Tarun", "Python Developer", 23.4, 122, "Hello Sai"),
    //     new ProductsModel(2,"Sandeep", "Frontend Developer", 20.4, 1234, "Hello Sandeep"),
    //     new ProductsModel(3,"Vaibhav", "Devops Engineer", 122.4, 412, "Hello Vaibhav"),
    //     new ProductsModel(4, "Akshay", "Java Developer", 120.4, 4512, "Hello Akshay")
    //     ));
    public List<ProductsModel> getAllProducts() {
        return repo.findAll();
    }

    public ProductsModel getProductById(int id) {
        return repo.findById(id).orElse(new ProductsModel(4, "Akshay", "Java Developer", 120.4, 4512, "Hello Akshay"));
    //    return products.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public ProductsModel addProduct(ProductsModel product) {
        return repo.save(product);
        // return products.add(product) ? product : null;
    }

    public ProductsModel updateProduct(ProductsModel product) {
        return repo.save(product);
        // int index = products.indexOf(product);
        // return products.set(product.getId(), product) != null ? product : null;
    }

    public String deleteProduct(int id) {
        repo.deleteById(id);
        return "Deleted";
        // return products.removeIf(t -> t.getId() == id) ? "Deleted" : "Not Found";
        // return products.removeIf(t -> t.getId() == id) ? "Deleted" : "Not Found";
    }

}
