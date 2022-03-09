package com.kiersten.str.demo;

public class StringDemo {
public static void main(String[] args) {
	/*String s1 = "Hello World!";
	String s2 = "Hello world!";
	
	if(s1 == s2)
		System.out.println("Equal");
	else
		System.out.println("Not equal");*/
	String s1 = new String("Hello World!");
	String s2 = new String("Hello World!");
	
	if(s1.equals(s2))
		System.out.println("Equal");
	else
		System.out.println("Not equal");
	
}
}
