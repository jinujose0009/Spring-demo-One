package jinu.learn.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifecycleApp {

	public static void main(String[] args) {
		//Load the confi file
				ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanLifecyclepplicationContext.xml");
				
				//Retrive bean from spring container	
				TrackCoach thecoach=context.getBean("myCoach",TrackCoach.class);
				//TrackCoach thecoach1=context.getBean("myCoach",TrackCoach.class);
				
				
						
						System.out.println(thecoach.getDailyfortune());
						
						//close the context
						context.close();

	}

}
