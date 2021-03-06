package com.smoothy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SmoothySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmoothySpringApplication.class, args);
	}
}
