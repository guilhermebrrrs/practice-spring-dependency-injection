package com.practice.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Customer {
	
	public Customer(String email, String name, String telephone) {
		this.email = email;
		this.name = name;
		this.telephone = telephone;
		
		this.isActive = false;
	}
	
	private String email;
	
	private Boolean isActive = false;
	
	private String name;
	
	private String telephone;
	
	public void activate() {
		this.isActive = true;
	}
	
}
