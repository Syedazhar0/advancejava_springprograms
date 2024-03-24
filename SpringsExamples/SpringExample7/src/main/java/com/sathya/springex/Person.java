package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	// autowired on field automatically create object and inject object to dependencies
	@Autowired
	private HomeLoneService homeLoneService;
	@Autowired
	private RealStateService realStateService;
	
	//public HomeLoneService getHomeLoneService() {
		//return homeLoneService;
	//}
	// autowired on setters automatically create object and inject object to dependencies
	//@Autowired
	//public void setHomeLoneService(HomeLoneService homeLoneService) {
		//this.homeLoneService = homeLoneService;
	//}
	//public RealStateService getRealStateService() {
		//return realStateService;
	//}
	//@Autowired
	//public void setRealStateService(RealStateService realStateService) {
		//this.realStateService = realStateService;
	//}
	// autowired on constructor automatically create object and inject object to dependencies
	//@Autowired
//	public Person(HomeLoneService homeLoneService, RealStateService realStateService) {
//		super();
//		this.homeLoneService = homeLoneService;
//		this.realStateService = realStateService;
//	}
public void personinfo() {
	System.out.println("complete information related to ........");
	homeLoneService.HomeLone("instant loan",20,"syed azhar");
	realStateService.realstate("hyderabad", "syed");
}
	}

