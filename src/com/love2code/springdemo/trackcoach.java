package com.love2code.springdemo;

public class trackcoach implements coach {

	private fortuneservice FortuneService;

	public trackcoach(fortuneservice fortuneService) {
		super();
		FortuneService = fortuneService;
	}
    

	public String getDailyWorkout() {
		
		return "run a hard 5k";
	}

	public String getdailyfortune() {
		
		return "just do it"+FortuneService.getfortune();
	}
	
	//init method
	public void domystartupstuff()
	{
		System.out.println("This method will be called on init");
		
	}
	
	//destroy method
	public void domyendstuff()
	{
		System.out.println("This method will be called on destroy");
		
		
	}

}
