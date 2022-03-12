package com.revature.apps.list;

import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
public static void main(String[] args) {
    //HashMap<String,Double> balance=new HashMap<String,Double>();
    TreeMap<String,Double> balance=new TreeMap<String,Double>();
    balance.put("John", new Double(1000.50));
    balance.put("Jane", new Double(2560.50));
    balance.put("Tom", new Double(5678.50));
    balance.put("Todd", new Double(4567.50));
    System.out.println(balance.get("John"));
    
    Set<String> keys=balance.keySet();
    for(String key:keys)
        System.out.println(key +" : "+balance.get(key));
}
}