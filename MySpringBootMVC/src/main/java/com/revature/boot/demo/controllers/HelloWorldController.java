package com.revature.boot.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/mycontroller")
public class HelloWorldController {
	
	@RequestMapping("/abc")
	public String helloThere() {
		return "hello";
	}
}
