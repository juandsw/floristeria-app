package com.floristeria.floristeria_app.mapper;

import com.floristeria.floristeria_app.dto.ProductDTO;
import com.floristeria.floristeria_app.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

   public ProductDTO toDTO(ProductEntity productEntity) {
       return new ProductDTO(productEntity.getId(), productEntity.getName(), productEntity.getDescription(), productEntity.getPrice(), productEntity.getCategory());
   }

   public ProductEntity toEntity(ProductDTO productDTO) {
       ProductEntity productEntity = new ProductEntity();
       productEntity.setId(productDTO.getId());
       productEntity.setName(productDTO.getName());
       productEntity.setDescription(productDTO.getDescription());
       productEntity.setPrice(productDTO.getPrice());
       productEntity.setCategory(productDTO.getCategory());
       return productEntity;

   }

}




