package com.example.security.inmemory;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class MemoryService {
	
	
	@PreAuthorize("hasRole('user')")
	public String test() {
		//
		//
		//
		//
		//
		return "service is activated";
	}

}
