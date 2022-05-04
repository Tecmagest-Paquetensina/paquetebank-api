package com.paquetebank.paquetebank.api.repository;

import com.paquetebank.paquetebank.api.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovementRepository extends JpaRepository<Movement, Integer> {
}
