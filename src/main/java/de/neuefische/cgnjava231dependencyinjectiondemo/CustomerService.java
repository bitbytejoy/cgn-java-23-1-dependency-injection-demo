package de.neuefische.cgnjava231dependencyinjectiondemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final ProductRepository productRepository;

    public CustomerService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
