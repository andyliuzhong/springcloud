package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//Eureka 客户端
@EnableEurekaClient
//服務發現
@EnableDiscoveryClient
//开启Hystrix
@EnableCircuitBreaker
public class DeptProvider8001Hystrix_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001Hystrix_App.class, args);
	}
}
