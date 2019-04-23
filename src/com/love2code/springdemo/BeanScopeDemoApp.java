package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
	//load the bean configuration file
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
	
	//retrieve the bean
	coach thecoach= context.getBean("mycoach", coach.class);
	coach alphacoach= context.getBean("mycoach", coach.class);

	//check if the beans are same
	boolean result=(thecoach==alphacoach);
	System.out.println("\npointing to same location? "+result);
	System.out.println("Memory location for thecoach "+thecoach);
	System.out.println("Memory location for alphacoach "+alphacoach);

	
	//call the method
		
	//close the context
	context.close();
	}

}
