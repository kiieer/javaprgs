package com.revature.mytests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.revature.main.Assignment;


public class MyTests {

	static Assignment at;
	//this is making a static global variable to cut out steps
	
	@BeforeAll
	public static void setUp() {
		at = new Assignment();
	}
	
	@Test
	public void testCube() {
		int addResult = at.cube(2);
		Assertions.assertEquals(8, addResult);
	}
	
	@Test
	public void testFac() {
		int addResult = at.fac(5);
		Assertions.assertEquals(120, addResult);
	}
	
}
