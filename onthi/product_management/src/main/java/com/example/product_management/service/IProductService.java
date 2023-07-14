package com.example.product_management.service;

import com.example.product_management.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    void update(Product product);
    void deleteById(int id);
    Product findById(int id);
}
