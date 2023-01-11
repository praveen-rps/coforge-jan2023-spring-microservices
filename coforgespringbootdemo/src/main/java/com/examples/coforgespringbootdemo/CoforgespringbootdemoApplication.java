package com.examples.coforgespringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.examples.controllers")
public class CoforgespringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoforgespringbootdemoApplication.class, args);
	}
}
