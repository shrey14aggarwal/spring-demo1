package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
	
	//load the bean configuration file
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
	
	//retrieve the bean
	coach thecoach= context.getBean("mycoach", coach.class);
	
	//call the method
	System.out.println(thecoach.getDailyWorkout());

	
	//call the method
		
	//close the context
	context.close();
	}

}
