package com.cg.spring.core.training.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	private Integer id;
	private String name;
	
	@Autowired
	private Address address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [ \n id=" + id + ",\n name=" + name + " \n]";
	}
	
	
   
}
