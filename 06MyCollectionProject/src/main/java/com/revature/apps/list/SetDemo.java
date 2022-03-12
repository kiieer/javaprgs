package com.revature.apps.list;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	/// HashSet<String> set = new HashSet<String>(); //hash set has no order.
	TreeSet<String> set = new TreeSet<String>(); //sorts in alphabetical order. tree is sorted.
	set.add("Robert");
	set.add("Lindi");
	set.add("Noel");
	set.add("Sarah");
	set.add("Firas");
	
	for(String name:set) {
		System.out.println(name);
	}
	
}
}
