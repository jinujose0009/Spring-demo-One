package jinu.learn.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from spring container
		Coach thecoach=context.getBean("myCoach",Coach.class);
		
		
		//call methode on the bean
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyfortune());
		
		//close the context
		context.close();
		

	}

}
