package com.dayeliu.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dayeliu.cloud.entities.Dept;
/**
 * Feign 
 * @author liuch
 *	
 */
import com.dayeliu.cloud.service.DeptClientService;
@RestController
public class DeptControllerFeign {
	//定义在公共Api中
	@Autowired
	private DeptClientService service;
	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return this.service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return this.service.list();
	}

	@RequestMapping(value = "/consumer/dept/add")
	public Object add(Dept dept)
	{
		return this.service.add(dept);
	}
}
