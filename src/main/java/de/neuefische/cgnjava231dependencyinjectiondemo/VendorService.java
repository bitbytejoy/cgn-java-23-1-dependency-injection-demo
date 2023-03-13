package de.neuefische.cgnjava231dependencyinjectiondemo;

import org.springframework.stereotype.Service;

@Service
public class VendorService {
    private final ProductRepository productRepository;

    public VendorService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
