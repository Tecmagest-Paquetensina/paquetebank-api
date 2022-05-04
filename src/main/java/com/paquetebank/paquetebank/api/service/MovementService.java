package com.paquetebank.paquetebank.api.service;

import com.paquetebank.paquetebank.api.dto.NewMovement;
import com.paquetebank.paquetebank.api.model.Movement;
import com.paquetebank.paquetebank.api.model.MovementType;
import com.paquetebank.paquetebank.api.model.UserAccount;
import com.paquetebank.paquetebank.api.repository.MovementRepository;
import com.paquetebank.paquetebank.api.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MovementService {
    @Autowired
    private MovementRepository movementRepository;

    @Autowired
    private UserAccountRepository userAccountRepository;
    public void save(NewMovement newMovement){
        Movement movement = new Movement();

        Double amount = newMovement.getAmount();
        if (newMovement.getType() == MovementType.DESPESA)
            amount = amount * -1;

        movement.setMovementDate(LocalDateTime.now());
        movement.setDescription(newMovement.getDescription());
        movement.setAccountId(newMovement.getAccountId());
        movement.setType(newMovement.getType());
        movement.setAmount(amount);

        UserAccount userAccount = userAccountRepository.findById(newMovement.getAccountId()).orElse(null);
        if(userAccount != null){
            userAccount.getAccount().setBalance(userAccount.getAccount().getBalance() + amount);
            userAccountRepository.save(userAccount);
        }
        movementRepository.save(movement);
    }
}
