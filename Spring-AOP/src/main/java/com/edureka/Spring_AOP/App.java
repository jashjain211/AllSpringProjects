package com.edureka.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * Creatig basic customer service class and 
 * printing few methods for demonstration
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("customer.xml");
    	CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
    	
    	cust.printName();
    	cust.printURL();
    	try {
    		cust.printThrowException();
    	}
    	catch(Exception e) {
    		
    	}
        System.out.println( "Hello World!" );
    }
}
