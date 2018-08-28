package constructor.injection.anotacija;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("constructorInjectionContext.xml");
		
		Zaposleni zaposleni = (Zaposleni) applicationContext.getBean("zaposleni");
		
		zaposleni.setIme("Hasan");
		
		System.out.println("Ime je : " + zaposleni.getIme());
		
		applicationContext.close();
	}
}
