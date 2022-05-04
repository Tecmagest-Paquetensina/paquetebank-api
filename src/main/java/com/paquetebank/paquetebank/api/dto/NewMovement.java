package com.paquetebank.paquetebank.api.dto;

import com.paquetebank.paquetebank.api.model.MovementType;

public class NewMovement {
    private String description;
    private Double amount;
    private MovementType type;
    private Integer accountId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public MovementType getType() {
        return type;
    }

    public void setType(MovementType type) {
        this.type = type;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
