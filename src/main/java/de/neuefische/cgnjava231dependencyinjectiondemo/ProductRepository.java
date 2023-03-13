package de.neuefische.cgnjava231dependencyinjectiondemo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> products = new ArrayList<>();

    public List<Product> findAll() {
        return products;
    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
