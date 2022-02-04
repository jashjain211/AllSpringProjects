package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		//below line creates a spring container and what's present in this container is
		// called spring bean this line basically returns an object
		
		ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
		
		//below statement checks whether customer bean available or not
		Customers c = context.getBean(Customers.class);
		c.display();
		
	}

}
