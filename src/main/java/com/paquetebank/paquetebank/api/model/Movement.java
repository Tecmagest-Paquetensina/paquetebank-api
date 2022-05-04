package com.paquetebank.paquetebank.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_movement")
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "movement_date")
    private LocalDateTime movementDate;

    private String description;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private MovementType type;

    @Column(name = "account_id")
    private Integer accountId;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDateTime getMovementDate() {
        return movementDate;
    }
    public void setMovementDate(LocalDateTime movementDate) {
        this.movementDate = movementDate;
    }
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
