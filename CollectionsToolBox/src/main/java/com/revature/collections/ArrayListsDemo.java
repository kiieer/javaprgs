package com.revature.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsDemo {
	public static void main(String[] args) {
		
		//creating an object that stores Strings
		ArrayList<String> stringList = new ArrayList<String>();
		
		//creating an object that stores (wrapper class) integers
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		// adding Strings to the stringList object
		stringList.add("Bob");
		stringList.add("Zed");
		stringList.add("Sue");
		stringList.add("Addi");
		
		// adding integers to the arrayList object
		arrayList.add(56);
		arrayList.add(45);
		arrayList.add(463);
		arrayList.add(1);
		
		//gets one of the items in the array using the index
		System.out.println("Getting index 0: [" + stringList.get(0) + "]");
		System.out.println("Getting index 1: [" +arrayList.get(1)+ "]");
		
		System.out.println("");
		
		//calls the whole object
		System.out.println("All of the Strings: " + stringList);
		System.out.println("All of the integers: " + arrayList);
		
		System.out.println("");
		
		//Set is overwriting the String that is present in the index 0
		stringList.set(0, "TestingSetMethod");
		System.out.println("Set Method: " + stringList.get(0));
		System.out.println("All of the Strings: " + stringList);

		System.out.println("");
		
		//Size of an array
		System.out.println("Size of the String Array: " + stringList.size());
		System.out.println("Size of the Integer Array: " + arrayList.size());
		
		System.out.println("");
		
		//Loop through elements using a for loop.
		System.out.println("");
		System.out.println("Loop through elements with a for loop:");
		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
		
		System.out.println("");
		
		//Loop through elements using a for-each loop.
		System.out.println("Loop through elements with a for-each loop:");
		for (int i : arrayList) {
			System.out.println(i);
		}
		
		System.out.println("");
		
		//Sorting a list alphabetically or numerically
		System.out.println("Unsorted: ");
		System.out.println("All of the Strings: " + stringList);
		System.out.println("All of the integers: " + arrayList);
		
		System.out.println("");
		System.out.println("Sorted:");
		Collections.sort(stringList);
		Collections.sort(arrayList);
		System.out.println("All of the Strings: " + stringList);
		System.out.println("All of the integers: " + arrayList);
		
		System.out.println("");
		//Removes a String at this index.
		stringList.remove(0);
		System.out.println("All of the Strings: " + stringList);
		
		//Removes all the integers in the array list.
		arrayList.clear();
		System.out.println("All of the integers: " + arrayList);
		
		
			
		
	}
}
