package com.revature.boot.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyFormsController {
	
	@RequestMapping("/myform")
	public String showForm() {
		return "myform";
	}
	
	@RequestMapping(value = "/processForm", method= RequestMethod.POST)
	public String processingForm(@RequestParam("firstName") String fName,
			@RequestParam("lastName") String lName,
			Model model) {
		String fullName = fName.toUpperCase() + lName.toUpperCase();
		
		//business logic 
		model.addAttribute("names", fullName);
		
		
		
		return "form-output";
	}
}
