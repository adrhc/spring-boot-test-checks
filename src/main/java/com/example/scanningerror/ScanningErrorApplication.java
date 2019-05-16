package com.example.scanningerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ScanningErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScanningErrorApplication.class, args);
	}

}
