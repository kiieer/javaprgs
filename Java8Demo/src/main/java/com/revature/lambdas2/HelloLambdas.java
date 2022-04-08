package com.revature.lambdas2;

public class HelloLambdas {
public static void main(String[] args) {
	/*
	 * Hello hi = () -> { return "Hello Lambdas"; };
	 * System.out.println(hi.sayHello());
	 */
	
	//doesnt need parenthesis in argument if argument is single
	//one statement doesn't need curly braces either
	//kept them for demostration
	Hello hello = (firstname, lastname)-> {
		return "Hello " + firstname + " " + lastname;
	};
	System.out.println(hello.sayHello("Kiersten", "Christlieb"));
}
}
