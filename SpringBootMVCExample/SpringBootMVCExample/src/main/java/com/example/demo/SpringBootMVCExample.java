package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootMVCExample {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMVCExample.class, args);

		/*
		 * int count = context.getBeanDefinitionCount();
		 * 
		 * System.out.println(" count :"+count);
		 * 
		 * String[] names = context.getBeanDefinitionNames();
		 * 
		 * for( String name : names) { System.out.println(" bean names are :"+name); }
		 */

	}

}
