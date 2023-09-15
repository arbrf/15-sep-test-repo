package com.progrank;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;


@SpringBootApplication
public class Main {
	public static void main(String args[]) {
		System.out.println("Hello world2");
		System.out.println("Iam stuffed");
		ConfigurableApplicationContext context=  SpringApplication.run(Main.class,args);
		
	}

}
