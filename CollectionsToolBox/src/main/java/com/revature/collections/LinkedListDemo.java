package com.revature.collections;

import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	//creating an object that stores Strings
	//LinkedList has everything ArrayLists have except that it is
	//developed differently.
	LinkedList<Integer> linkedNums = new LinkedList<Integer>();
	
	//creating an object that stores (wrapper class) integers
	LinkedList<String> linkedStrings = new LinkedList<String>();
	
	// adding Strings to the stringList object
	linkedStrings.add("One");
	linkedStrings.add("Two");
	linkedStrings.add("Three");
	linkedStrings.add("Four");
	
	// adding integers to the arrayList object
	linkedNums.add(3);
	linkedNums.add(2);
	linkedNums.add(13);
	linkedNums.add(354);
	
	System.out.println("List of Strings originally: " + linkedStrings);
	System.out.println("List of Integers originally: " +linkedNums);
	System.out.println("");
	
	//Use addFirst() to add the item in the beginning.
	linkedStrings.addFirst("Zero");
	linkedNums.addFirst(20);
	System.out.println("List of Strings after addFirst(): " + linkedStrings);
	System.out.println("List of Integers after addFirst(): " +linkedNums);
	
	System.out.println("");
	
	//Use addLast() to add an item at the ending.
	linkedStrings.addLast("Five");
	linkedNums.addLast(23536);
	System.out.println("List of Strings after addLast(): " + linkedStrings);
	System.out.println("List of Integers after addLast(): " +linkedNums);
	
	System.out.println("");
	
	//Use removeFirst() to remove an item at the beginning.
	linkedStrings.removeFirst();
	linkedNums.removeFirst();
	System.out.println("List of Strings after removeFirst(): " + linkedStrings);
	System.out.println("List of Integers after removeFirst(): " +linkedNums);
	
	System.out.println("");
	
	//Use removeFirst() to remove an item at the beginning.
		linkedStrings.removeLast();
		linkedNums.removeLast();
		System.out.println("List of Strings after removeLast(): " + linkedStrings);
		System.out.println("List of Integers after removeLast(): " +linkedNums);

	System.out.println("");
		
	//Use getFirst() and getLast().
		System.out.println("getFirst(): " + linkedStrings.getFirst());
		System.out.println("getLast(): " + linkedStrings.getLast());

}
}
