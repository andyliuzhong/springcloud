package com.daeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//eureka客户端  集成Ribbon
@EnableEurekaClient
public class Consumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80_App.class, args);
	}
}
