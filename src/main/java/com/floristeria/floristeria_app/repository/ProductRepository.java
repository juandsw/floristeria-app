package com.floristeria.floristeria_app.repository;

import com.floristeria.floristeria_app.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}