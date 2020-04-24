package com.microservices.escorpions.app.microbioeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicrobioEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrobioEurekaApplication.class, args);
	}

}
