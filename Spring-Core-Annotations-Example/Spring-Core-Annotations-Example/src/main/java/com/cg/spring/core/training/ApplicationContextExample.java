package com.cg.spring.core.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.spring.core.training.beans.AccountManager;
import com.cg.spring.core.training.beans.Customer;
import com.cg.spring.core.training.beans.Employee;
import com.cg.spring.core.training.config.AppConfiguration;

public class ApplicationContextExample {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		
		Employee employee = (Employee)context.getBean("emp");
		Customer customer = (Customer)context.getBean("customer");
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		System.out.println(customer);
		System.out.println(customer.getAddress());
		
		AccountManager accountManager = (AccountManager)context.getBean("accountManager");
		System.out.println(accountManager);
		System.out.println(accountManager.getAccountService());
		accountManager.getAccountService().transfer();
		
		
		
		
	}

}
