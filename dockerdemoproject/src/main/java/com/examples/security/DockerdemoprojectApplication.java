package com.examples.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoprojectApplication.class, args);
	}
	
	@GetMapping("/get1")
	public String get1() {
		return "get1 method is called";
	}
	@GetMapping("/get2")
	public String get2() {
		return "get2 method is called";
	}

}
