package com.stockcontrol.stockcontrol.services;

import com.stockcontrol.stockcontrol.dtos.ProductDTO;
import com.stockcontrol.stockcontrol.entities.ProductEntity;
import com.stockcontrol.stockcontrol.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    public Optional<ProductEntity> findById(Long id) {
        return productRepository.findById(id);
    }

    public ProductEntity create(ProductEntity product) {
        return productRepository.save(product);
    }

    public ProductEntity update(Long id, ProductDTO productDTO) {
        Optional<ProductEntity> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            ProductEntity product = optionalProduct.get();
            product.setName(productDTO.getName());
            product.setDescription(productDTO.getDescription());
            product.setCostPrice(productDTO.getCostPrice());
            product.setSalePrice(productDTO.getSalePrice());
            product.setQuantity(productDTO.getQuantity());
            return productRepository.save(product);
        }
        return null;
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
