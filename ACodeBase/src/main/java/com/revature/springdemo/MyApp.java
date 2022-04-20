package com.revature.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
public static void main(String[] args) {
	//Coach bbCoach = new BasketBallCoach();
	//Coach tCoach = new TennisCoach();
	
	//System.out.println(bbCoach.getDailyWorkout());
	//System.out.println(tCoach.getDailyWorkout());
	
	//step 1. load the container
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");

	//step 2. get the obj reference from the container
	Coach coach = context.getBean("myCoach", Coach.class);
	
	//step 3. use the bean
	System.out.println(coach.getDailyWorkout());
	
	//step 4. calling the dependent method
	
	System.out.println(coach.getFortune());
	
	//step 5. close the context
	context.close();

}
}
