package com.revature.emp;

public interface Tax {
	
	public default void someMethod() {
		System.out.println("Some method.");
	}
	
	public static void someMethod2() {
		System.out.println("dkdkdkdkdkdkddkdk");
	}
	
	public void calculateTax();
}

// class extends class
// class implements interface(s)
// interface extends interface