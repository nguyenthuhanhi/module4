package com.example.product_management_thymeleaf.service;

import com.example.product_management_thymeleaf.model.Product;
import com.example.product_management_thymeleaf.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private IProductRepo repo;


    @Override
    public List<Product> findAll() {
        return repo.findAll();
    }

    @Override
    public void create(Product product) {
        repo.create(product);
    }

    @Override
    public Product findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void update( Product product) {
            repo.update(product);
    }

    @Override
    public void remove(Product product) {
        repo.remove(product);
    }

    @Override
    public Product findByName(String name) {
        return repo.findByName(name);
    }
}
