package com.medly.medly_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedlyAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedlyAppApplication.class, args);
        System.out.println("Application up and running...");
	}

}
