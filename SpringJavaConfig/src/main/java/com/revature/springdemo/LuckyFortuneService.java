package com.revature.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class LuckyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is our lucky day!";
	}

}
