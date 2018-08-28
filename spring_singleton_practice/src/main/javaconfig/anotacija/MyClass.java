package main.javaconfig.anotacija;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(ConfigKlasa.class);
		
		
		Auto auto = (Auto) annotationConfigApplicationContext.getBean("autfdi");
		auto.setImeAuta("Mercedes");
		auto.setModel("Super");
		
		Zaposleni zaposleni = (Zaposleni) annotationConfigApplicationContext.getBean("zadosleni");
		zaposleni.setIme("Mustafa");
		
		System.out.println("Ime je : " + zaposleni.getIme());
		System.out.println("Ime auta je : " + zaposleni.getAuto().getImeAuta());
		
		
		Zaposleni zaposleni2 = (Zaposleni) annotationConfigApplicationContext.getBean("zadosleni");
		zaposleni2.setIme("Hasan");
		zaposleni2.setAuto(new Auto("Audi", "Novi"));
		
		System.out.println("Zaposleni 2 je : " + zaposleni2.getIme() + " Auto je : " + zaposleni2.getAuto().getImeAuta());
		
		
		Zaposleni zaposleni3 = (Zaposleni) annotationConfigApplicationContext.getBean("zadosleni");
		zaposleni3.setIme("Kemal");
		zaposleni3.setAuto(new Auto("Yugo", "Stari"));
		
		System.out.println("Zaposleni 3 je : " + zaposleni3.getIme() + " Auto je : " + zaposleni3.getAuto().getImeAuta());
		System.out.println("Zaposleni 2 je : " + zaposleni2.getIme() + " Auto je : " + zaposleni2.getAuto().getImeAuta());
		
		annotationConfigApplicationContext.close();
	}
}
