package de.neuefische.cgnjava231dependencyinjectiondemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }
}
