package com.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}
	
	 public String play(int number) {

	        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
	        if (number % 3 == 0) return "Fizz";
	        if (number % 5 == 0) return "Buzz";


	        return String.valueOf(number);
	    }

}
