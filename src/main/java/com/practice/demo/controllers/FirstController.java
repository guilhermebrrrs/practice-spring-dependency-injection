package com.practice.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.demo.services.CustomerActivationService;

@Controller
public class FirstController {
	
	private CustomerActivationService customerActivationService;

	public FirstController(CustomerActivationService customerActivationService) {
		this.customerActivationService = customerActivationService;
	}

	@GetMapping("/")
	@ResponseBody
	public String hello() {

		return "Hello";
	}

}
