package com.revature.pkg;

public class PersonManager {
	public static void main(String[] args) {
		Person p = new Person ("J", 42);
		System.out.println(p);
		
		//you cannot change ArrayLists dynamically. 
		// if it is a fixed size, you can go ahead and use them.
		Person []person = new Person[10];
//		person[0] = new Person();
//		person[1] = new Person();
//		person[2] = new Person();
//		person[3] = new Person();
//		person[4] = new Person();
		
		//never use hard coded values.
		for(int i=0; i<person.length; i++) {
			person[i] = new Person();
		}
	}

}
