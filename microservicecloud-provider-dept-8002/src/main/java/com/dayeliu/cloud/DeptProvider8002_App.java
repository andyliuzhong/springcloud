package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//Eureka 客户端
@EnableEurekaClient
//服務發現
@EnableDiscoveryClient
public class DeptProvider8002_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_App.class, args);
	}
}
