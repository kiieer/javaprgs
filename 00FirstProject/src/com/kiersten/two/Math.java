package com.kiersten.two;

public class Math extends Calculator {
	public static void main(String[] args) {
		Math equation = new Math();
		System.out.println("Addition: " + equation.getAddition(1, 2));
		System.out.println("Subtraction: " + equation.getSubtraction(1, 2));
		System.out.println("Multiplication: " + equation.getMultiplication(3, 2));
		System.out.println("Division: " + equation.getDivison(15, 5));
	}
}
