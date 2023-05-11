package com.ltwhotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}