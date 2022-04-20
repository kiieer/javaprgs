package com.revature.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	private static final Logger logger = LogManager.getLogger(MainApp.class);
public static void main(String[] args) {
	// step 1. create a container
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
	
	// step 2. get a bean from context
	AccountDAO dao = context.getBean("accountDAO", AccountDAO.class);
	
	//this is a join
	// step 3. call business method using bean
	dao.addAccount();
	dao.addCard();
	System.out.println("[CUSTOMER NAME] " + dao.getCustomerName());
	dao.testingAroundAdvice();
	dao.thisMethodThrowsException();
	
	// step 4. close the context
	context.close();
}
	
}
