package com.cg.spring.core.training.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AccountManager {
	
	@Autowired
	@Qualifier("savingsAccountService")
	private AccountService accountService;

	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	

}
