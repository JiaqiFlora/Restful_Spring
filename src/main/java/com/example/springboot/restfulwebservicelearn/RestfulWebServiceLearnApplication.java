package com.example.springboot.restfulwebservicelearn;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.springdoc", "com.example.springboot.restfulwebservicelearn"})
public class RestfulWebServiceLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServiceLearnApplication.class, args);
	}

}
