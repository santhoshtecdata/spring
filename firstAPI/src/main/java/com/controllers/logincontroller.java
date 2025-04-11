package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.login;

@RestController

public class logincontroller {

	@Autowired(required=true)
	public login log;
	
	@GetMapping("/")
	public String name() {
		return "hi user";
		}
	
	
	@GetMapping("about")
	public String about() {
		String status = "This is About page";
		return status;
	}

	
	
	@GetMapping("login")
	public String loginpage() {
		
		return log.log();
	}


}
