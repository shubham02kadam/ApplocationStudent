package com.jdc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {
	
	@GetMapping("/emp")
	public String getdata() {
		return "I am shubham kadam";
		
		
	}

}
