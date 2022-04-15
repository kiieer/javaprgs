package com.revature.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations001 {
public static void main(String[] args) {
	List <String> names = new ArrayList<String>();
	names.add("Eric");
	names.add("Jorge");
	names.add("Deagan");
	names.add("Robert");
	names.add("Joy");
	names.add("Ryan");
	
	System.out.println("______ [Enhanced For Loop] ______");

	//using enhanced for loops
	for (String name:names) {
		System.out.println(name);
	}
	System.out.println("______ [Streams Demostration] ______");

	
	//using streams
	//names.stream().forEach(n->System.out.println(n));
	names.stream().forEach(System.out::println); //method referencing

	System.out.println("______ [Filtering a Stream] ______");
	//filter names beginning with j
	names.stream().filter((n)-> n.startsWith("J")).forEach(System.out::println);


	System.out.println("______ [Map Demostration] ______");
	names.stream().map(String::toUpperCase).forEach(System.out::println);
	
	System.out.println("______ [Map Demostration] ______");

}
}
