package com.dayeliu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.dayeliu.myrule.MyselfRule;

@SpringBootApplication
//eureka客户端  集成Ribbon
@EnableEurekaClient
//启动微服务自动加载我们自定义的Ribbo配置类，使配置生效
//按照自定义的Ribbon负载均衡
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
public class Consumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80_App.class, args);
	}
}
