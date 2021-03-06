package com.revature.assignment;

import com.revature.assignment.controller.AssignmentController;

import com.revature.assignment.controller.StringController;

import io.javalin.Javalin;

public class Assignment {
	public static void main(String[] args) {
		Javalin app = Javalin.create().start();
		
		//Lowercase: http://localhost:8080/lowercase/KiErStEn
		app.get("/lowercase/{name}", StringController.lowerCase);
	
		//Uppercase: http://localhost:8080/uppercase/KiErStEn
		app.get("/uppercase/{name}", StringController.upperCase);
		
		//Length: http://localhost:8080/length/kiersten
		app.get("/length/{name}", StringController.length);
		
		//Addition: http://localhost:8080/add/1/2
		app.get("/add/{n1}/{n2}", AssignmentController.addNums);
		
		//Subtraction: http://localhost:8080/sub/3/2
		app.get("/sub/{n1}/{n2}", AssignmentController.subNums);
		
		//Multiplication: http://localhost:8080/mup/2/8
		app.get("/mup/{n1}/{n2}", AssignmentController.mupNums);
		
		//Division: http://localhost:8080/div/16/2
		app.get("/div/{n1}/{n2}", AssignmentController.divNums);
}	
}
