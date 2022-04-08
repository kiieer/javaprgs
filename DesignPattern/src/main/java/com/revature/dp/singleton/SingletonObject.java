package com.revature.dp.singleton;

public class SingletonObject {
	private static SingletonObject single = new SingletonObject();
	
	private SingletonObject() {
	}
	
	public static SingletonObject getInstance() {
		return single;
	}
}
