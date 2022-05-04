package com.paquetebank.paquetebank.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paquetebank.paquetebank.api.dto.NewUserAccount;
import com.paquetebank.paquetebank.api.model.UserAccount;
import com.paquetebank.paquetebank.api.repository.UserAccountRepository;
import com.paquetebank.paquetebank.api.service.UserAccountService;

@RestController
@RequestMapping("/users-accounts")
public class UserAccountController {
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private UserAccountService userAccountService;
	
	@GetMapping
	public List<UserAccount> findAll(){
		return userAccountRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NewUserAccount userAccount) {
		userAccountService.save(userAccount);
	}
}
