package com.revature.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println("[ACCOUNT CREATED]");
	}
	
	public void addCard() {
		System.out.println("[CARD ADDED]");
	}
	
	public String getCustomerName() {
		return "Bobby Hill";
	}
	
	public void thisMethodThrowsException() {
		System.out.println("Beware, exception is incoming.");
		throw new RuntimeException();
	}
	
	public void testingAroundAdvice() {
		System.out.println("This is inside around advice.");
	}
}
