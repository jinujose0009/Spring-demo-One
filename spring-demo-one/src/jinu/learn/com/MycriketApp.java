package jinu.learn.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MycriketApp {

	public static void main(String[] args) {
				
				//Load spring configuration file
				ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//Retrive bean from spring container
				CricketCoach thecoach=applicationContext.getBean("myCriketcoach",CricketCoach.class);
				
				//calls methode on the bean
				System.out.println(thecoach.getDailyWorkout());
				System.out.println(thecoach.getDailyfortune());
				System.out.println(thecoach.getAlternativeFortune());
				System.out.println(thecoach.getLocation());
				System.out.println(thecoach.getEmail());
				
				
				//Close teh context
				applicationContext.close();

	}

}
