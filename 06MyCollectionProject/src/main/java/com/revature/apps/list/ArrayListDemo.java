package com.revature.apps.list;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {
public static void main(String[] args) {
    // ArrayList arrayList= new ArrayList();     //creating arraylist object, this creates a generic, which lets you use many data types
    ArrayList<Integer> arrayList= new ArrayList<Integer>(); //only Integers Wrapper Class will be accepted.

    System.out.println(arrayList.size());     // initial size is zero 

    arrayList.add(1);                        //taking a primitive into a wrapper class which is making it an object
    arrayList.add(100);
    arrayList.add(200);
    // arrayList.add("Jasdhir");             // because this is a string it will not work, unless it's in a Generic....
    System.out.println(arrayList);           // three objects in the collection

    ArrayList<Integer> a2= new ArrayList<Integer>();
    a2.add(1111);
    a2.add(11113);

    a2.add(1, 3333);   // (adding numbers at index's)

    Iterator itr= arrayList.iterator();
    while (itr.hasNext())
        System.out.println(itr.next());    //it will print every object of the area list one after another


        System.out.println("Add all in ArrayList a2");   // adding a2 to arrayList --- the existing list
    arrayList.addAll(a2);



    System.out.println("An index is going  to be removed");
    arrayList.remove(2); //this removes at index 2 of the arrayList




    for (int i=0; i<arrayList.size(); i++)  //this is the second way to print every object of the area list one after another
        System.out.println(arrayList.get(i));

    for( int i:arrayList)                  // for (value receiving: fromcollection)   --enhanced for loop     -- good for iterating over a collection
        System.out.println(i);



}
}
