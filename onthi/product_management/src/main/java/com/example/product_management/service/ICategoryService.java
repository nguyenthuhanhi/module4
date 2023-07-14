package com.example.product_management.service;

import com.example.product_management.entity.Category;
import com.example.product_management.entity.Product;

import java.util.List;

public interface ICategoryService {

    void create(Category category);
    void update(Category category);
    Category findById(int id);
    List<Category> findAll();
    void deleteById(int id);
}
