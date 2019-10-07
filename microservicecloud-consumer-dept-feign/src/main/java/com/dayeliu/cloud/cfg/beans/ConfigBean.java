package com.dayeliu.cloud.cfg.beans;


import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 配置类
 * @author liuch
 *
 */
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
@Configuration
public class ConfigBean {
	@Bean
	//Ribbon负载均衡 默认轮询
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	//自定义实现负载均衡 指定随机算法  默认为轮询
	//随机
	@Bean
	public IRule myRule(){
//		return new RetryRule(); //先按照轮询，当有服务挂掉时，回单位时间重试， 跳过有异常的服务
		return new RandomRule();//随机
	}
}
