package com.stockcontrol.stockcontrol.repositories;

import com.stockcontrol.stockcontrol.entities.StockOperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockOperationRepository extends JpaRepository<StockOperationEntity, Long> {
}
