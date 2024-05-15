package com.practice.demo.services;

import org.springframework.stereotype.Component;

import com.practice.demo.models.Customer;
import com.practice.demo.models.Product;
import com.practice.demo.notifiers.CustomerEmailNotifier;

@Component
public class InvoiceIssuerService {

	private CustomerEmailNotifier customerEmailNotifier;

	public void issueInvoice(Customer customer, Product product) {
		System.out.println("Emita nota fiscal");

		customerEmailNotifier.notify(customer,
				String.format("Nota fiscal do produto %s foi emitida.", product.getName()));
	}

}
