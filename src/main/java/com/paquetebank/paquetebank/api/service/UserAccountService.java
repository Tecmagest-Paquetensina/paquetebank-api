package com.paquetebank.paquetebank.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paquetebank.paquetebank.api.dto.NewUserAccount;
import com.paquetebank.paquetebank.api.model.Account;
import com.paquetebank.paquetebank.api.model.UserAccount;
import com.paquetebank.paquetebank.api.repository.UserAccountRepository;

@Service
public class UserAccountService {
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	public void save(NewUserAccount newUserAccount) {
		UserAccount userAccount = new UserAccount();
		userAccount.setCpfNif(newUserAccount.getCpfNif());
		userAccount.setName(newUserAccount.getName());
		
		Account account = new Account();
		account.setBalance(0.0);
		account.setNumber(new Date().getTime());
		
		userAccount.setAccount(account);
		userAccountRepository.save(userAccount);
	}
}
