package com.kiersten.two;

public class Calculator {
	protected int n1;
	protected int n2;

	public int getAddition(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
	public int getSubtraction(int n1, int n2) {
		int sub = n1 - n2;
		return sub;
	}
	
	public int getMultiplication(int n1, int n2) {
		int mup  = n1 * n2;
		return mup;
	}
	
	public int getDivison(int n1, int n2) {
		int div  = n1 / n2;
		return div;
	}
}

