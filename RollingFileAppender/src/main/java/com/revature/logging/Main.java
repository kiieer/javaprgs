package com.revature.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");
        logger.debug("This is a Debug Message!");
        logger.info("This is an Info Message!");
        logger.error("And here comes the Error Message!", new RuntimeException("RunRunRun"));
        
    }
}