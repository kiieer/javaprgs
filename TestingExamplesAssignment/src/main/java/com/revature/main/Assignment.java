package com.revature.main;


public class Assignment {
	
	public int cube(int n1) {
		int result = n1 * n1 * n1;
		return result;
	}
	
	public int fac(int n1) {
		int temp = n1;
		int sum = 0;
		while (temp > 1) {
			sum+= n1 * (n1 - 1);
			temp--;
		}
		return temp;
	}
}
