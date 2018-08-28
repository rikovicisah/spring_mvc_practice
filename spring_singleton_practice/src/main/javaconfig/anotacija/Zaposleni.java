package main.javaconfig.anotacija;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zaposleni {
	
	@Value("${foo.ime}")
	private String ime;
	private String prezime;
	
	@Autowired
	private Auto auto;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	@PostConstruct
	public void postIspis() {
		System.out.println("Ispis odmah poslije konstruktora");
	}
	
	@PreDestroy
	public void preDestroyIspis() {
		System.out.println("Ispis prije destroy");
	}
	
}
