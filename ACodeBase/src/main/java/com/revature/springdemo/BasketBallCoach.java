package com.revature.springdemo;

public class BasketBallCoach implements Coach {
	FortuneService fortuneService;
	
	//public BasketBallCoach(FortuneService fortuneService) {
		///System.out.println("Constructor of basket ball coach.");
		//this.fortuneService = fortuneService;
	//}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Injection");
		this.fortuneService = fortuneService;
	}
	

	public String getDailyWorkout() {
		return "Practice Dribbling";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	public void someMethod() {
		System.out.println("This is some method... Doing something. Yep. Totally not suspicious at all, what are you talking about?");
	}
	
	public void someMethodAgain() {
		System.out.println("I DESTROYYYYYY");
	}
	
}
