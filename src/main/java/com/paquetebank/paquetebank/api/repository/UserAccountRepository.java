package com.paquetebank.paquetebank.api.repository;

import com.paquetebank.paquetebank.api.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

}
