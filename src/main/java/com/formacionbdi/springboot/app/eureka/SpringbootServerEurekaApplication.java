package com.formacionbdi.springboot.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServerEurekaApplication.class, args);
	}

}
