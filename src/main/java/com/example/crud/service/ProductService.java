package com.example.crud.service;

import com.example.crud.model.Product;
import com.example.crud.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Optional<Product> findById(Long id) {
        var optional = productRepository.findById(id);
        if(optional.isEmpty()) {
            throw new RuntimeException("product didn't find");
        }
        return optional;
    }

    public Product editProduct(Product product, Long id, String name, String description) {
        var optional = productRepository.findById(id);
        if(optional.isEmpty()) {
            throw new RuntimeException("product didn't find");
        }
        product.setName(name);
        product.setDescription(description);
        return productRepository.save(product);
    }

    public Product findProductByName(String name) {
        return productRepository.findByName(name);
    }
}
