package com.revature.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger(Main.class);
public static void main(String[] args) {
    
    logger.info("Inside the main method");
    logger.info("About to execute sysout");
    logger.debug("Hello from Log4j 2");
    logger.debug("This is a Debug Message!");
     
    System.out.println("Hi There");
    
      logger.info("This is an Info Message!");
      logger.error("And here comes the Error Message!", new
      RuntimeException("RunRunRun")); logger.warn("This is a warn msg");
     
    logger.info("About to create object of Some Class");
    
    SomeClass some=new SomeClass();
    logger.info("object of Some Class created");
    some.someMethod();
    
    
}
}