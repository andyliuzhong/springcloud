package com.dayeliu.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dayeliu.cloud.entities.Dept;
import com.dayeliu.cloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	// eureka服务发现
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	//每个方法都会对应一个fallback 耦合度高   通过failbackfactor实现
	@HystrixCommand(fallbackMethod = "failback")
	public Dept get(@PathVariable Long id) {
		Dept dept = deptService.get(id);
		//模拟异常情况
		if(null == dept){
			throw new RuntimeException("该ID："+id +"没有对应的信息");
		}
			
		return deptService.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}

	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		// 多少个微服务
		List<String> list = client.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}
	/**
	 * hystrix fail back
	 * 
	 */
	public Dept failback(@PathVariable("id") Long id){
		return new Dept().setDeptno(id).setDname("该ID："+id +"没有对应的信息")
				.setDb_source("no this datasource");
	}
}
