package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// Eureka 启动Eureka Server的注解
@EnableEurekaServer
public class EurekaServer7001App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001App.class, args);
	}
}
