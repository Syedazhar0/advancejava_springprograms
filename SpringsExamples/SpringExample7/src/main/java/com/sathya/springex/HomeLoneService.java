package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class HomeLoneService {
	 String loantype;
	 int rateofintereset;
	 String applicantdetails;
	
	public void HomeLone(String loantype, int rateofintereset, String applicantdetails) {
		System.out.println("home loan info");
		System.out.println("lone type is "+loantype);
		System.out.println("rate of interest is"+rateofintereset);
		System.out.println("applicantdetails are "+applicantdetails);
	}
	}

