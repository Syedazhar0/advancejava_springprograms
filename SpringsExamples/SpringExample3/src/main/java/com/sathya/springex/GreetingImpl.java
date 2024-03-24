package com.sathya.springex;

public class GreetingImpl  implements Greeting{

	@Override
	public void greet() {
	System.out.println("this is example 1");
	System.out.println("java based configuration");
		
	}
	
	public  GreetingImpl() {
		System.out.println("GreetingImpl constructor : : object created");
	}

}
