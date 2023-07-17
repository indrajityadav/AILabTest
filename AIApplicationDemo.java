package com.ai.spring.app.aiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AIApplicationDemo {

	public static void main(String[] args) {
		System.out.println("This application is running using tabnine aiapp.");
		String str = null;
		System.out.println(str.toString());
		SpringApplication.run(AIApplicationDemo.class, args);
	}

}
