package com.example.security.inmemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityControllers {
	
	@Autowired
	MemoryService service;
	
	@GetMapping("/testadmin")
	public String testadmin() {
		return "admin "+service.test();
	}
	
	@GetMapping("/testuser")
	public String testcustomer() {
		return "user called "+service.test();
	}
	
	@GetMapping("/delete")
	public String deleteCustomer() {
		return "Hello, customer is delete successully....";
	}

}
