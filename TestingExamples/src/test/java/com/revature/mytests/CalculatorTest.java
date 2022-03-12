package com.revature.mytests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.revature.logic.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) 
public class CalculatorTest {
	static Calculator c ;//= new Calculator();
	//this is making a static global variable to cut out steps
	
	@BeforeAll
	public static void setUp() {
		c = new Calculator();
	}
	
	@Test
	@Order(4)
	public void testAdd() {
		//Calculator c = new Calculator();
		int addResult = c.add(2, 3);
		Assertions.assertEquals(5, addResult);
	}
	
	@Test
	// @Disabled
	@Order(2)
	public void testSub() {
		//Calculator c = new Calculator();
		int addResult = c.sub(10, 3);
		Assertions.assertEquals(7, addResult);
	}
	
	@Test
	@Order(1)
	public void testMup() {
		//Calculator c = new Calculator();
		int addResult = c.mup(3, 3);
		Assertions.assertEquals(9, addResult);
	}
	
	@Test
	@Order(3)
	public void testDiv() {
		//Calculator c = new Calculator();
		int addResult = c.div(10, 5);
		Assertions.assertEquals(2, addResult);
	}
	
	@Test
	//@Test(expected = ArithmeticException.class)  // JUNIT 4
	public void testDivision() {
		System.out.println("Testing Division ");
		//Assertions.assertEquals(10, c.divide(10, 0));
		
		  Assertions.assertThrows(ArithmeticException.class,() -> { c.div(10, 0); });
			
	}

}
