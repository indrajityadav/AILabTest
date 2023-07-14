package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Indrajit Yadav");
		DemoApplication demo = new DemoApplication();
		if(demo == null){
			System.out.println("Object is null");
		}
		SpringApplication.run(DemoApplication.class, args);
	}

}
