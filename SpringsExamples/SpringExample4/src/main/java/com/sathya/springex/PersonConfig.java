package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

	@Bean
	public Person person() {
		Person person= new Person() ;
		person.setName("azhar");
		person.setEmail("azhar152003@gmail.com");		
		return person;
	}
}
