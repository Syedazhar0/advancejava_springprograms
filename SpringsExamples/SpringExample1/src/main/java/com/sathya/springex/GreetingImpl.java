package com.sathya.springex;

public class GreetingImpl  implements Greeting{

	@Override
	public void greet() {
		System.out.println("this is spring first example ");
		System.out.println("hello world");
	}
	public GreetingImpl() {
		System.out.println("GreetingImpl constructor : : created successfully");
	}

}
