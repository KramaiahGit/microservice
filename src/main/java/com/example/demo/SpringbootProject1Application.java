package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject1Application.class, args);
	}

	@RequestMapping("/welcome")
	public String welcome() {
		
		return "Welcome to Spring by Kumardfdfdfdfd dfdfdfdfd";
	}
	
}
