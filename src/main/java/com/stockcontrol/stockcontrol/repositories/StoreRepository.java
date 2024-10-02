package com.stockcontrol.stockcontrol.repositories;

import com.stockcontrol.stockcontrol.entities.StoreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreEntity, Long> {
}
