package com.revature.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SomeClass {
    static Logger logger = LogManager.getLogger(SomeClass.class);
public void someMethod() {
    System.out.println("In Some Method");
    logger.debug("Logger Called for Some Class");
    
}
}