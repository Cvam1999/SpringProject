package com.cg.spring.core.training.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	
	@Autowired
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [\n id=" + id + ",\n name=" + name + ",\n salary=" + salary + "\n]";
	}
	
   
}
