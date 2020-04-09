package com.example.openshift.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private String role;
	
	
	public Employee()
	{
		
	}
	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	

}
