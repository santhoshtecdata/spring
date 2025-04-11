package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.services.*;
@RestController
public class statusController {
	@Autowired
	private status sta;
	
	@GetMapping("status")
	public String status() {
		return sta.message();
	}
	
	

}
