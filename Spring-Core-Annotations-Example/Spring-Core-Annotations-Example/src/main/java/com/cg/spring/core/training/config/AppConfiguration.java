package com.cg.spring.core.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.cg.spring.core.training.beans.AccountManager;
import com.cg.spring.core.training.beans.Address;
import com.cg.spring.core.training.beans.CurrentAccountService;
import com.cg.spring.core.training.beans.Customer;
import com.cg.spring.core.training.beans.Employee;
import com.cg.spring.core.training.beans.SavingsAccountService;

@Configuration
public class AppConfiguration {
	
	@Bean(name = "emp")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(199);
		emp.setName("Ganesh");
		emp.setSalary(78700.00);
		return emp;
	}
	
	@Bean(name = "customer")
	public Customer getCustomer() {
		Customer cust = new Customer();
		cust.setId(345);
		cust.setName("Suresh Kumar");
		return cust;
	}
	
	@Bean(name = "address")
	@Scope("prototype")
	public Address getAddress() {
		Address address = new Address();
		address.setCity("Bangalore");
		address.setStreet("Ramalaya Street");
		address.setState("Karnataka");
		address.setPincode("560098");
		address.setCountry("India");
		return address;
	}
	
	@Bean("accountManager")
	public AccountManager getAccountmanager() {
		AccountManager am = new AccountManager();
		return am;
	}
	
	
	@Bean("savingsAccountService")
	public SavingsAccountService getSavingsAccountService() {
		SavingsAccountService sas = new SavingsAccountService();
		return sas;
	}
	
	@Primary
	@Bean("currentAccountService")
	public CurrentAccountService getCurrentAccountService() {
		CurrentAccountService cas = new CurrentAccountService();
		return cas;
	}

}
