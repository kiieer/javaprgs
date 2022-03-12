package com.revature.mytests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 
//this helps the order annotation work. there is a class called MethodOrderer.
public class FirstTest {
	
	@Test //this tells me this is a test method.
	@Order(2) //this indicates the order of the methods ran.
	public void firstTest () {
		System.out.println("This is my first test.");
	}
	
	@Test
	//@Disabled //this disables the second test.
	@Order(1)
	public void secondTest() {
		System.out.println("This is my second test.");
	}

	@BeforeEach //This runs before each test method.
	public void methodBeforeEach() {
		System.out.println("This is before each.");
	}
	
	@AfterEach //This runs after each test method.
	public void methodAfterEach() {
		System.out.println("This is after each.");
	}
	
	@BeforeAll //This runs before all of the methods.
	public static void methodBeforeAll() {
		System.out.println("This is before all.");
	}
	
	@AfterAll //This runs after all of the methods.
	public static void methodAfterAll() {
		System.out.println("This is after all.");
	}
}
