package com.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class about {
	
	@GetMapping("about")
	public String aboutMessage() {
		String status = "This is About page";
		return status;
	}

}
