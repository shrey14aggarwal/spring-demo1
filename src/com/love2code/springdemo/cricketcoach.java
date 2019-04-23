package com.love2code.springdemo;

public class cricketcoach implements coach {

	private fortuneservice fortuneService;
	
	//make private field for email address and team name
	private String emailaddress;
	private String team;
	
	// no arg constructor
	
	public cricketcoach()
	{
		System.out.println("Inside the cricket coach class");
	}
	
	
	
	public String getDailyWorkout() {

		return "practice fast bowling 15 mins a day";
	}

	//setter method for injection
	public void setFortuneService(fortuneservice fortuneService) {
		System.out.println("Inside the setter method");

		this.fortuneService = fortuneService;
	}

	//setter method for email and team
	
	
	public String getdailyfortune() {

		return fortuneService.getfortune();
	}



	public String getEmailaddress() {
		return emailaddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailaddress(String emailaddress) {
		System.out.println("inside setter email");
		this.emailaddress = emailaddress;
	}



	public void setTeam(String team) {
		System.out.println("inside setter team");
		this.team = team;
	}

}
