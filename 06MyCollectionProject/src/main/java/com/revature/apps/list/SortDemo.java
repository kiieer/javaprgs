package com.revature.apps.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {
public static void main(String[] args) {
	ArrayList<Integer> aList = new ArrayList<Integer>();
	aList.add(5);
	aList.add(7);
	aList.add(3);
	aList.add(6);
	
	System.out.println(aList);
	
	//This is sorting the Collection.
	Collections.sort(aList);
	System.out.println(aList);
	aList.sort(null);

}
}
