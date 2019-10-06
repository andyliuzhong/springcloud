package com.daeliu.cloud.cfg.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 配置类
 * @author liuch
 *
 */
import org.springframework.web.client.RestTemplate;
@Configuration
public class ConfigBean {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
