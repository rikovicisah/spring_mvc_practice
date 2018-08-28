package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//loadati bean
		Zaposleni zaposleni = (Zaposleni) applicationContext.getBean("zaposleni");
		zaposleni.setIme("Mustafa");
		zaposleni.setPrezime("Mustafic");
		
		System.out.println("Ime : " + zaposleni.getIme() +
				" auto : " + zaposleni.getAuto().getImeAuta());
		
		//zatvoriti context
		applicationContext.close();
	}
}
