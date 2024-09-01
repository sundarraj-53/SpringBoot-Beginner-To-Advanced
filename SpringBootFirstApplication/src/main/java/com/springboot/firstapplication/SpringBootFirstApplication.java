package com.springboot.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootFirstApplication {

	@Bean
	public HelloWorld hellworld(){
		return new HelloWorld();
	}

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
		HelloWorld helloWorld=context.getBean(HelloWorld.class);
		System.out.println(helloWorld.getPrint());
	}

}
