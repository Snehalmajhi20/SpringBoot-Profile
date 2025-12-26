package com.profile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class ProfileController {
	
	@GetMapping("/cafe")
	public String cafeprofile() {
		return "Welcome to Cafe Shop Profile";
	}
	
	@GetMapping("/cafelogin")
	public String cafelogin() {
		return "Welcome to Cafe Shop Login Page";
	}
	
	@GetMapping("/cafelogout")
	public String cafelogout() {
		return "Welcome to Cafe Shop Logout Page";
	}

}
