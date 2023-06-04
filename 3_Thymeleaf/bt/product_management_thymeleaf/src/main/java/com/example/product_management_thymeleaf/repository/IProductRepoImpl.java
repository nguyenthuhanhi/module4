package com.example.product_management_thymeleaf.repository;

import com.example.product_management_thymeleaf.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class IProductRepoImpl implements IProductRepo{

    private static final List<Product> products;

    static {

        products = new ArrayList<>();
        products.add( new Product(1,"Tivi",5000000,"Bao hanh 6th","Samsung"));
        products.add( new Product(2,"Tu Lanh",12000000,"Bao hanh 12th","Sonoc"));
        products.add( new Product(3,"May Giat",8000000,"Bao hanh 6th","ABV"));
        products.add( new Product(4,"May Lanh",9000000,"Bao hanh 12th","Aqua"));
        products.add( new Product(5,"Ban Ghe",1000000,"Bao hanh 6th","Hoang Moc"));
        products.add( new Product(6,"LapTop",19000000,"Bao hanh 12th","Dell"));
    }
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product: products) {
            if (product.getId()==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update( Product product) {
        for (Product product1 : products) {
            if (product1.getId()==(product.getId())) {
                product1.setId(product.getId());
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setProducer(product.getProducer());
                break;
            }
        }
    }

    @Override
    public void remove(Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==(product.getId())) {
                products.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findByName(String name) {
        for (Product product: products) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
