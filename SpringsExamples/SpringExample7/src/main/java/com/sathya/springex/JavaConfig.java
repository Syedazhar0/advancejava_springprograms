package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sathya.springex")
public class JavaConfig {
	
//	@Bean
//	public HomeLoneService homeLoneService() {
//		HomeLoneService homeLoneService=new HomeLoneService();
//		return homeLoneService;
//		
//	}
//	
//	@Bean 
//	public RealStateService realStateService () {
//		RealStateService realStateService=new RealStateService();
//		return realStateService;
//	}
//	
//	@Bean
//	public Person person () {
//		//Person person = new Person(homeLoneService(),realStateService ());
//		Person person = new Person();
//		person.setHomeLoneService(homeLoneService());
//		person.setRealStateService(realStateService ());
//		return person;
//	}

}
