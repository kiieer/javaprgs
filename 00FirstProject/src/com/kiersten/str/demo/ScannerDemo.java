package com.kiersten.str.demo;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int n1 = sc.nextInt();
	
	System.out.println("Enter the second number: ");
	int n2 = sc.nextInt();
	
	System.out.println("Sum: " + (n1+n2));
	sc.close();
}
}
