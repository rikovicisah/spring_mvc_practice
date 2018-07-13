package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args){
		
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = applicationContext.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getBroj());
		
		CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
		CricketCoach cricketCoach2 = applicationContext.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println("Kriket " + cricketCoach.getDailyWorkout());
		System.out.println("Kriket broj " + cricketCoach.getBroj());
		System.out.println("Email : " + cricketCoach.getEmail());
		System.out.println("Team : " + cricketCoach.getTeam());
		
		
		if(cricketCoach == cricketCoach2)
			System.out.println("Isti");
		else
			System.out.println("Nije isti");
		
		applicationContext.close();
	}
}
