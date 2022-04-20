package com.revature.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class BaseBallCoach implements Coach {
	
	//Lazy/field level injection
	//@Autowired
	//@Qualifier("jackPotFortuneService")
	FortuneService lfs;

	//Constructor injection
	//used if you're injecting multiple things at
	//object creation.
	//@Autowired
	public BaseBallCoach(FortuneService lfs) {
		this.lfs = lfs;
	}
	
	//Setter injection
//	@Autowired
//	public void setLfs(FortuneService lfs) {
//		this.lfs = lfs;
//	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice pitching PFP..";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return lfs.getFortune();
	}

}
