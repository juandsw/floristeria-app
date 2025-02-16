package com.floristeria.floristeria_app.service;

import com.floristeria.floristeria_app.entity.ProductEntity;
import com.floristeria.floristeria_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
       return productRepository.findAll();
    }

    public ProductEntity getProductById(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        return product.orElse(null);
    }

    public ProductEntity createProduct(ProductEntity product) {
        return productRepository.save(product);
    }

    public ProductEntity updateProduct(Long id, ProductEntity product) {
        if(productRepository.existsById(id)) {
            product.setId(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
       if(productRepository.existsById(id)) {
           productRepository.deleteById(id);
       }
    }
}

