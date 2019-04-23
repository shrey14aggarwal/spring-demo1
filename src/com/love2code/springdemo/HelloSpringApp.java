package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    coach thecoach= context.getBean("mycoach", coach.class);
    System.out.println(thecoach.getDailyWorkout());
    System.out.println(thecoach.getdailyfortune());
    context.close();
	}

}
