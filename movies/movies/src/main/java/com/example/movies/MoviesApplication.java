package com.example.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

//	@GetMapping("/")
//	public String apiRoot(){
//		return "Hello, World! ";
//		//this lets our application know we want the apiroot to return a string hello world
//		//this is called an endpoint
//
//
//
//	}




}
