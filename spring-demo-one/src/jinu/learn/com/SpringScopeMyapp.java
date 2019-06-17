package jinu.learn.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringScopeMyapp {

	public static void main(String[] args) {
		//Load the confi file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ScopeapplicationContext.xml");
		
		//Retrive bean from spring container	
		TrackCoach thecoach=context.getBean("myCoach",TrackCoach.class);
		TrackCoach thecoach1=context.getBean("myCoach",TrackCoach.class);
		
		Boolean status=(thecoach==thecoach1);
		System.out.println("Status:"+status);
				System.out.println("Memory location for thecoach:"+thecoach);
				System.out.println("Memory location for thecoach1"+thecoach1);
				
				//close the context
				context.close();

	}

}
