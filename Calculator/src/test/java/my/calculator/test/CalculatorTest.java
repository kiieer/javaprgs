package my.calculator.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import my.calculator.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    static Calculator c=null;
    
    //@BeforeEach
    @BeforeAll
    static void setUpThis() {
        System.out.println("Creating Object ");
        c=new Calculator();
    }
    
    @Test
    @Order(2)
    void testAdd() {
        // c=new Calculator();
        System.out.println("Testing Add...");
        Assertions.assertEquals(4, c.add(2, 2));
        
    }
    
    @Test
    @Order(1)
    @Disabled
    void testSub() {
         //c=new Calculator();
        System.out.println("Testing Sub...");
        Assertions.assertEquals(4, c.subtract(2, 2));
        
    }
    
    @Test
    //@Test(expected = ArithmeticException.class)  // JUNIT 4
    public void testDivision() {
        System.out.println("Testing Division ");
        //Assertions.assertEquals(10, c.divide(10, 0));
        
          Assertions.assertThrows(ArithmeticException.class,() -> { c.divide(10, 0); });
            
    }
    
    @AfterAll
    static void cleanUp() {
        System.out.println("Cleaning Up...");
    }
}