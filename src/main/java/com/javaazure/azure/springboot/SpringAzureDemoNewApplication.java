package com.javaazure.azure.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoNewApplication {
	@GetMapping("/message")
	public String message(){
		return "First GitHub Action using Azure webapps";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoNewApplication.class, args);
	}

}
