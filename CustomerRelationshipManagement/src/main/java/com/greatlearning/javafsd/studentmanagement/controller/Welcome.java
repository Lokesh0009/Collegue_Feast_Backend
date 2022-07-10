package com.greatlearning.javafsd.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	
	@RequestMapping("/")
	public String handleWelcome() {
		return "welcome";
	}

}
