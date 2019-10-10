package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Eureka 启动Eureka Server的注解
@EnableEurekaServer
public class EurekaServerConfig7001App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerConfig7001App.class, args);
	}
}
