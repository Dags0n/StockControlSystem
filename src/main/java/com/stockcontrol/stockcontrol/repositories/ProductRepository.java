package com.stockcontrol.stockcontrol.repositories;

import com.stockcontrol.stockcontrol.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
