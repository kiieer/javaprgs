package com.revature.exceptions.custom;

public class PersonManager {
public static void main(String[] args) {
	Person person = new Person("Kiersten", 17);
	Person person2 = new Person("David", 18);
	
	try {
		person.castVote();
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.err.println(e.getMessage());
	}
	
	try {
		person2.castVote();
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}
