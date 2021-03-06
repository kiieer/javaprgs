package com.revature.exceptions;

public class FirstException {
	public static void main(String[] args) {
		int x = 20;
		int y = 0;
		int result = 0; 
		int []nums = {1, 2, 3, 4, 5};
		try { // once an exception is caught in a try block, it will skip the rest of the code.
			System.out.println("Before Exception");
		result = x/y;
		System.out.println("After Exception .... ");
		} catch(ArithmeticException e) { // specific exception
			System.out.println("Catching the exception......");
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) { // whenever you are having multiple catch blocks, the generic ones come later on. the specific ones come on top
			System.out.println("Test."); //BAD IDEA to use the generic exception
		}
		
		try {
		System.out.println("Before Exception");
		nums[6] = 20;
		System.out.println("After Exception .... ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catching the exception......");
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		try { ////This is a compile time error.
			Class.forName("someClass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result = " + result);
		System.out.println("Done... ");
	}

}
