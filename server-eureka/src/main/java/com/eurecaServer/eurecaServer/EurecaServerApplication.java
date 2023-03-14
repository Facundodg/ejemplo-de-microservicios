package com.eurecaServer.eurecaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurecaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServerApplication.class, args);
	}

}
