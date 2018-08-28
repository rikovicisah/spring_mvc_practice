package main.anotacija;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new  ClassPathXmlApplicationContext("applicationContextAnotacija.xml");
		
		Zaposleni zaposleni = (Zaposleni) applicationContext.getBean("zaposleni");
		
		zaposleni.setIme("Mustafa");
		
		System.out.println("Ime je : " + zaposleni.getIme());
		
		applicationContext.close();
	}
}
