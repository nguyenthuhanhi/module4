package com.example.product_management.repository;

import com.example.product_management.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product, Integer> {
}
