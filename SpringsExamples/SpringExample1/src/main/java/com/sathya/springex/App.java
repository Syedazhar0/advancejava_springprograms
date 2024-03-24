package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        GreetingImpl greetingImpl = context.getBean("greet",GreetingImpl.class);
        greetingImpl.greet();
    	System.out.println( "Hello World!" );
    }
}
