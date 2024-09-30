package com.stock_control_system.stock_control_system.mappers;

import com.stock_control_system.stock_control_system.dto.ProductDTO;
import com.stock_control_system.stock_control_system.entities.ProductEntity;

public class ProductMapper {
    public ProductDTO toDTO(ProductEntity productEntity) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productEntity.getId());
        productDTO.setName(productEntity.getName());
        productDTO.setDescription(productEntity.getDescription());
        return productDTO;
    }

    public ProductEntity toEntity(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(productDTO.getId());
        productEntity.setName(productDTO.getName());
        productEntity.setDescription(productDTO.getDescription());
        return productEntity;
    }
}
