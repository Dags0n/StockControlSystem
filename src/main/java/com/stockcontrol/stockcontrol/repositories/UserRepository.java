package com.stockcontrol.stockcontrol.repositories;

import com.stockcontrol.stockcontrol.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
