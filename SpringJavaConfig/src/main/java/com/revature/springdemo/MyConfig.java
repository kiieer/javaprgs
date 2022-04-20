package com.revature.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.revature.springdemo")
public class MyConfig {
	
	@Bean
	public FortuneService luckyFortuneService() {
		return new LuckyFortuneService();
	}
	
	@Bean
	public Coach baseBallCoach() {
		return new BaseBallCoach(luckyFortuneService());
	}
 }
