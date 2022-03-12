package com.revature.apps.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonManager {
	public static void main(String[] args) {
	Person p1 = new Person("Ryan", 25);
	Person p2 = new Person("Jack", 23);
	Person p3 = new Person("Noel", 24);
	
	ArrayList<Person> person = new ArrayList<Person>();
	
	person.add(p1);
	person.add(p2);
	person.add(p3);
	
	System.out.println(person);
}

}
