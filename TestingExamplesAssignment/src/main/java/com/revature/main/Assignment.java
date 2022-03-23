package com.revature.main;


public class Assignment {
	
	public String name(String fname, String lname) {
		String result = fname + " " + lname;
		return result;
	}
	
	public int cube(int n1) {
		int result = n1 * n1 * n1;
		return result;
	}
	
	public int fac(int n1) {
		int counter = n1;
		int temp = n1;
		
		while (counter > 2) {
			temp = temp * (n1 - 1);
			n1 = n1 - 1;
			System.out.println(temp);
			counter --; }
		return temp;
	}
}
