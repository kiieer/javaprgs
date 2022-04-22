package com.revature.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String helloMethod() {
		return "hello";
	}
	@RequestMapping("/hithere")
	public String hiThere() {
		return "hi";
	}
	
	@RequestMapping("/showForm") //--> http://localhost:9090/showForm
    public String showForm() {
        return "helloworld-form";
    }
	
	  @RequestMapping("/processFormVersionThree")
	    public String processFormVersionThree(
	            @RequestParam("studentName") String theName,
	            Model model) {

	        // convert the data to all caps
	        theName = theName.toUpperCase();

	        // create the message
	        String result = "Hey My Friend from v3! " + theName;

	        // add message to the model
	        model.addAttribute("message", result);

	        return "helloworld";
	    }
}
