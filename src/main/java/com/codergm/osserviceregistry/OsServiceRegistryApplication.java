package com.codergm.osserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsServiceRegistryApplication.class, args);
	}

}
