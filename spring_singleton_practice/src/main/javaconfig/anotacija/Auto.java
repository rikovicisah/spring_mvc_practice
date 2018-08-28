package main.javaconfig.anotacija;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Auto {
	private String imeAuta;
	private String model;
	public Auto() {
		
	}
	
	public Auto(String imeAuta, String model) {
		this.imeAuta = imeAuta;
		this.model = model;
	}
	
	public String getImeAuta() {
		return imeAuta;
	}
	public void setImeAuta(String imeAuta) {
		this.imeAuta = imeAuta;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
