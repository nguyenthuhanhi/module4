package com.example.product_management.repository;

import com.example.product_management.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepo extends CrudRepository<Category, Integer> {
}
