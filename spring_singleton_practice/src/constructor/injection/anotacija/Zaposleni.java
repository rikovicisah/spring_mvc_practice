package constructor.injection.anotacija;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Zaposleni {
	private String ime;
	private String prezime;
	private Auto auto;
	
	public Zaposleni() {
		
	}
	
	@Autowired
	public Zaposleni(Auto auto) {
		this.auto = auto;
	}

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
	
	
}
