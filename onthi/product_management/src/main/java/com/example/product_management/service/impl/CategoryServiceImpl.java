package com.example.product_management.service.impl;

import com.example.product_management.entity.Category;
import com.example.product_management.repository.ICategoryRepo;
import com.example.product_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepo repo;

    @Override
    public void create(Category category) {
        repo.save(category);
    }

    @Override
    public void update(Category category) {
        repo.save(category);
    }

    @Override
    public Category findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Category> findAll() {
        return (List<Category>) repo.findAll();
    }

    @Override
    public void deleteById(int id) {
            repo.deleteById(id);
    }
}
