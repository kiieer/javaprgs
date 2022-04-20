package com.revature.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	Coach sCoach = context.getBean("baseBallCoach", Coach.class);
	System.out.println(sCoach.getDailyWorkout());
	System.out.println(sCoach.getDailyFortune());
}
}
