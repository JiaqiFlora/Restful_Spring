package com.example.springboot.restfulwebservicelearn.helloworld;

import java.time.LocalDate;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {
	
	private MessageSource messageSource;
	
	private HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World!");
	}
	
	// /users/{id}/tods/{id}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
	
	@GetMapping(path = "/hello-world-internationalize")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
		
	}
	
	
}
