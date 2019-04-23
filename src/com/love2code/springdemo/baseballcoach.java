package com.love2code.springdemo;

public class baseballcoach implements coach {
	
private fortuneservice FortuneService;


public baseballcoach(fortuneservice thefortuneservice)
{
	FortuneService = thefortuneservice;
}
	
public String getDailyWorkout()
{
return "Spend 30 minutes on batting practice";	

}

public String getdailyfortune() {
	
	return FortuneService.getfortune();
     }
}
