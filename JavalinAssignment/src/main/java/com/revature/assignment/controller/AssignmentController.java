package com.revature.assignment.controller;

import io.javalin.http.Handler;

public class AssignmentController {
	
	public static Handler addNums = ctx-> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result =  num1 + num2;
		ctx.result("Sum: " + result);
	};
	
	public static Handler subNums = ctx-> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result =  num1 + num2;
		ctx.result("Subtraction: " + result);
	};
	
	public static Handler mupNums = ctx-> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result =  num1 * num2;
		ctx.result("Multiplication: " + result);
	};
	
	public static Handler divNums = ctx-> {
		int num1 = Integer.parseInt(ctx.pathParam("n1"));
		int num2 = Integer.parseInt(ctx.pathParam("n2"));
		int result =  num1 / num2;
		ctx.result("Division: " + result);
	};
	
}
