package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 注冊到eureka 获取其他微服务信息 做路由
 * 不使用zuul调用|:http://localhost:8001/dept/list
 * 使用zuul:  http://localhost:9527/microservicecloud-dept/dept/list
 * @author liuch
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527_App {
	public static void main(String[] args) {
		SpringApplication.run(Zuul9527_App.class, args);
	}
}
