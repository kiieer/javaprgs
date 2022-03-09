package com.revature.assignment.controller;

import io.javalin.http.Handler;

public class StringController {
	
	public static Handler lowerCase = ctx-> {
		String name = ctx.pathParam("name");
		ctx.result("Lowercase: " + name.toLowerCase());
	};
	
	public static Handler upperCase = ctx-> {
		String name = ctx.pathParam("name");
		ctx.result("Lowercase: " + name.toUpperCase());
	};
	
	public static Handler length = ctx-> {
		String name = ctx.pathParam("name");
		ctx.result("Length: " + name.length());
	};

}
