package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterdemoapp {

	public static void main(String[] args) {
		//load the spring config file
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//get the bean from bean config file
	cricketcoach theCoach = context.getBean("mycricketCoach", cricketcoach.class);
		
	//call the methods
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getdailyfortune());
	System.out.println(theCoach.getEmailaddress());
	System.out.println(theCoach.getTeam());
	
	//close the context
	context.close();
	}

}
