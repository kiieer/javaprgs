package com.kiersten.oops;

public class PersonManager {
public static void main(String[] args) {
	Person p1 = new Person(); // creating object of Person class.
	
	p1.setName("Jas");
	p1.setAge (42);
	
	System.out.println(p1.getName() + " " + p1.getAge() + " " + p1.city);
	
	Person p2 = new Person("Jasdhir", 42);
	System.out.println(p2.getName() + " " + p2.getAge());
	
	System.out.println("Person 1: " + p1);
	System.out.println("Person 2: " + p2);

}
}
