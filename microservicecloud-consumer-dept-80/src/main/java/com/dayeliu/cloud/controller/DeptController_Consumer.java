package com.dayeliu.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dayeliu.cloud.entities.Dept;
/**
 * 消费controller
 * @author liuch
 *
 */
@RestController
public class DeptController_Consumer {
	//单机版微服务访问
	//private static final String REST_URL_PREFIX = "http://localhost:8001";
	//通过微服务名作为访问地址
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	@Autowired
	private RestTemplate restTemplate;
	//getMapping不支持@RequestBody
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}
	@RequestMapping(value="/consumer/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable Long id){
		return restTemplate.getForObject(REST_URL_PREFIX +"/dept/get/" + id, Dept.class);
	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list",method=RequestMethod.GET)
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}
	@RequestMapping(value="/consumer/dept/discovery",method=RequestMethod.GET)
	public Object discovery(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
	}
}
