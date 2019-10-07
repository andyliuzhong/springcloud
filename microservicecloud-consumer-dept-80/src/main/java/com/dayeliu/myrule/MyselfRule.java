package com.dayeliu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
/**
 * 自定义Ribbon负载均衡
 * 注意:根据官网要求,该类不能再@ConponentScan包及其子包下
 * @author liuch
 *
 */
@Configuration
public class MyselfRule {
	/**
	 * Ribbon自带的随机算法
	 */
	@Bean
	public IRule myRule(){
//		return new RetryRule(); //先按照轮询，当有服务挂掉时，回单位时间重试， 跳过有异常的服务
		return new RandomRule();//随机
	}
	/**
	 * 自定义负载均衡
	 */
}
