package com.revature.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class JackPotFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Your lucky numbers are: 32, 34, 56, 16, 20";
	}

}
