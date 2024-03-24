package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class RealStateService {
	 String agentlocation;
	 String agentname;
	public void realstate(String agentlocation, String agentname) {
		System.out.println("plots for sale");	
		System.out.println("agent locatioin is "+agentlocation);
		System.out.println("agent agentname "+agentname);
	}
}
