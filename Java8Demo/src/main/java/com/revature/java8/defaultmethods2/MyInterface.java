package com.revature.java8.defaultmethods2;

public interface MyInterface {
	public String methodOne();
	public default String methodTwo() {
		return null;
	}
}
