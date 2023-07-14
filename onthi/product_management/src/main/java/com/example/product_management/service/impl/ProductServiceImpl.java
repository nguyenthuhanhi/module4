package com.example.product_management.service.impl;

import com.example.product_management.entity.Product;
import com.example.product_management.repository.IProductRepo;
import com.example.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepo repo;

    @Override
    public List<Product> findAll() {
        return (List<Product>) repo.findAll();
    }

    @Override
    public void create(Product product) {
        repo.save(product);
    }

    @Override
    public void update(Product product) {
            repo.save(product);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return repo.findById(id).orElse(null);
    }
}
