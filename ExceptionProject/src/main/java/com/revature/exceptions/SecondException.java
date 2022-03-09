package com.revature.exceptions;

public class SecondException {
public static void main(String[] args) {
	int num[] = {1, 2, 3, 4, 5};
	try {
		num[6] = 20;
	} catch(ArrayIndexOutOfBoundsException ae) {
		ae.printStackTrace();
		System.out.println("Exception.");
	} finally {
		System.out.println("This is finally block.");
		// for clean up
	}
}
}
