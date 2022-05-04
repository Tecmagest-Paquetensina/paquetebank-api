package com.paquetebank.paquetebank.api.repository;

import com.paquetebank.paquetebank.api.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovementRepository extends JpaRepository<Movement, Integer> {
    public List<Movement>findByAccountId(Integer accountId);
}
