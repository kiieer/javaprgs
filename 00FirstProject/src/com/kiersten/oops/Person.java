package com.kiersten.oops;

public class Person {
	private String name;
	private int age;
	public static String city = "New York";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() { //default
	}
	
	public Person(String name, int age) { //parameterized constructor
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
