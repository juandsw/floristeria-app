package com.floristeria.floristeria_app.application.secondaryports.repository;

import com.floristeria.floristeria_app.application.secondaryports.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}