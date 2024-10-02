package com.stockcontrol.stockcontrol.repositories;

import com.stockcontrol.stockcontrol.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
