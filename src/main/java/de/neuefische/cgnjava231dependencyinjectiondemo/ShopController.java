package de.neuefische.cgnjava231dependencyinjectiondemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ShopController {
    private final CustomerService customerService;
    private final VendorService vendorService;

    public ShopController(CustomerService customerService, VendorService vendorService) {
        this.customerService = customerService;
        this.vendorService = vendorService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return customerService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return vendorService.addProduct(product);
    }
}
