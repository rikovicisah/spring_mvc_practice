package main.javaconfig.anotacija;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:zaposleni2.properties")
//Ako pravimo custom beanove onda nam ne treba 
//ComponentScan("main.javaconfig.anotacija")
public class ConfigKlasa {

	
	@Bean
	@Scope("prototype")
	public Zaposleni zadosleni() {
		return new Zaposleni();
	}
	
	@Bean
	@Scope("prototype")
	public Auto autfdi() {
		return new Auto();
	}
}
