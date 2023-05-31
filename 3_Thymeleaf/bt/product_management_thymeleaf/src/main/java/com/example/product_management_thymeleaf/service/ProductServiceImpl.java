package com.example.product_management_thymeleaf.service;

import com.example.product_management_thymeleaf.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements IProductService{

    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1,"Tivi",5000000,"Bao hanh 6th","Samsung"));
        products.put(2, new Product(2,"Tu Lanh",12000000,"Bao hanh 12th","Sonoc"));
        products.put(3, new Product(3,"May Giat",8000000,"Bao hanh 6th","ABV"));
        products.put(4, new Product(4,"May Lanh",9000000,"Bao hanh 12th","Aqua"));
        products.put(5, new Product(5,"Ban Ghe",1000000,"Bao hanh 6th","Hoang Moc"));
        products.put(6, new Product(6,"LapTop",19000000,"Bao hanh 12th","Dell"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }



}
