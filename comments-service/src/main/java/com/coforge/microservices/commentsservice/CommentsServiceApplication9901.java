package com.coforge.microservices.commentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommentsServiceApplication9901 {

	public static void main(String[] args) {
		SpringApplication.run(CommentsServiceApplication9901.class, args);
	}

}
