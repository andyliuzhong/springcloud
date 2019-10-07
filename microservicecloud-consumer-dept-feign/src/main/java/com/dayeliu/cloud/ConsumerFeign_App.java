package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableEurekaClient
//Feign  Feign集成了Ribbon 默认轮询算法
@EnableFeignClients("com.dayeliu.cloud")
//@ComponentScan(basePackages = {"com.dayeliu.cloud"})
public class ConsumerFeign_App {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeign_App.class, args);
	}
}
