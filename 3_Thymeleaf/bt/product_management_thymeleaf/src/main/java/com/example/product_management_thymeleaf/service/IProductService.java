package com.example.product_management_thymeleaf.service;

import com.example.product_management_thymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    Product findById(int id);

    void update( Product product);

    void remove(Product product);
    Product findByName(String name);




}
