package com.company.authorization;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class API {


	@RequestMapping("/welcome") 
	public String welcome()
	{ 
		return "Welcome to boot!"; 
	} 
}
