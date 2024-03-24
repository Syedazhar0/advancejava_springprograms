package com.sathya.springex.SpringExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // start the container
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("vehicle-config.xml");
    	Traveller traveller  = context.getBean("traveller",Traveller.class);
        traveller.startjourny();
    
    }
}
