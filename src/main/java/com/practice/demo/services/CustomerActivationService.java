package com.practice.demo.services;

import org.springframework.stereotype.Component;

import com.practice.demo.models.Customer;
import com.practice.demo.notifiers.CustomerEmailNotifier;

@Component
public class CustomerActivationService {

	private CustomerEmailNotifier customerEmailNotifier;

	public CustomerActivationService(CustomerEmailNotifier customerEmailNotifier) {
		this.customerEmailNotifier = customerEmailNotifier;
	}

	public void activateCustomer(Customer customer) {
		customer.activate();

		customerEmailNotifier.notify(customer, "Seu cadastro no sistema está ativo!");
	}

}
