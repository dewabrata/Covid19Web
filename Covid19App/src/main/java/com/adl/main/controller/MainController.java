package com.adl.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/countries")
	public String countries() {
		
		return "countries";
	}
	
	@GetMapping("/faqs")
	public String faqs() {
		
		return "faqs";
	}
	
	@GetMapping("/prevention")
	public String prevention() {
		
		return "prevention";
	}
	
	@GetMapping("/symptoms")
	public String symptoms() {
		
		return "symptoms";
	}


}
