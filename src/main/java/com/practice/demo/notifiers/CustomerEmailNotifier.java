package com.practice.demo.notifiers;

import org.springframework.stereotype.Component;

import com.practice.demo.models.Customer;

@Component
public class CustomerEmailNotifier {

	public void notify(Customer customer, String message) {
		System.out.printf("Notificando %s através do email %s: %s\n", customer.getName(), customer.getEmail(), message);
	}

}
