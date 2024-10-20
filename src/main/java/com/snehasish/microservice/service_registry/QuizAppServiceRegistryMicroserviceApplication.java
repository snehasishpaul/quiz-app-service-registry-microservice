package com.snehasish.microservice.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuizAppServiceRegistryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizAppServiceRegistryMicroserviceApplication.class, args);
	}

}
