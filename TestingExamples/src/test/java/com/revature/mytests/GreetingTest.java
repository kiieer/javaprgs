package com.revature.mytests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.revature.junit.GreetingServiceImpl;

public class GreetingTest {
	
	static GreetingServiceImpl gs;
	//this is making a static global variable to cut out steps
	
	@BeforeAll
	public static void setUp() {
		gs = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() {
		Assertions.assertEquals("Hello Jasdhir", gs.greet("Jasdhir"));
	}
}
