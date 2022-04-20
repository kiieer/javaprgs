package com.revature.springdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogging {
	private static final Logger logger = LogManager.getLogger(MyLogging.class);
	
	//this is my pointcut
	@Pointcut("execution(public void addAccount())")
	private void myPC() {
		
	}
	
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void add*())")
	@Before("myPC()")
	public void doSomethingBefore() {
		//this is my advice
		logger.info("I'm doing something before.");
	}
	
	//@After("execution(public void addAccount())")
	@After("myPC()")
	public void doSomethingAfter() {
		//this is my advice
		logger.info("I'm doing something after.");
	}
	
	@AfterReturning(pointcut = "execution(public String getCustomerName())", returning = "result")
	public void afterReturnMethod(String result) {
		logger.info("Name is: " + result.toUpperCase());
	}
	
	@Around("execution(public void testingAroundAdvice())")
	public void aroundAdviceCheck(ProceedingJoinPoint pjp) throws Throwable {
		logger.info("Inside around.");
		pjp.proceed();
		logger.info("Done calling method.");
	}
	
	@AfterThrowing(pointcut = "execution (public void thisMethodThrowsException())", throwing="theExc")
	public void handlingException(Exception theExc) {
		logger.info("Exception is " + theExc.getMessage());
	}
}
