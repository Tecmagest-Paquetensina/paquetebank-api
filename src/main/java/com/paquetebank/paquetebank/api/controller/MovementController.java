package com.paquetebank.paquetebank.api.controller;

import com.paquetebank.paquetebank.api.dto.NewMovement;
import com.paquetebank.paquetebank.api.dto.NewUserAccount;
import com.paquetebank.paquetebank.api.model.Movement;
import com.paquetebank.paquetebank.api.repository.MovementRepository;
import com.paquetebank.paquetebank.api.service.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
public class MovementController {
    @Autowired
    private MovementRepository movementRepository;

    @Autowired
    public MovementService movementService;

    @GetMapping
    public List<Movement> listAll(){
        return movementRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NewMovement movement){
        movementService.save(movement);
    }
}
