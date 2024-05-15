package com.practice.demo.notifiers;

import org.springframework.stereotype.Component;

import com.practice.demo.models.Customer;

@Component
public class CustomerSMSNotifier {

	public void notify(Customer customer, String message) {
		System.out.printf("Notificando %s via SMS através do número de telefone %s: %s\n", customer.getName(),
				customer.getTelephone(), message);
	}

}
