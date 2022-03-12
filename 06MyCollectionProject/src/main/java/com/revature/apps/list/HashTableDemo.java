package com.revature.apps.list;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
public static void main(String[] args) {
    Hashtable<String,Double> balance=new Hashtable<String,Double>();
    balance.put("John", new Double(1000.50));
    balance.put("Jane", new Double(2560.50));
    balance.put("Tom", new Double(5678.50));
    balance.put("Todd", new Double(4567.50));
    System.out.println(balance.get("John"));
    
    Enumeration names;
    String str;
    
    names=balance.keys();
    while(names.hasMoreElements()) {
        str=(String) names.nextElement();
        System.out.println(str+" : "+balance.get(str));
    }
    
}
}