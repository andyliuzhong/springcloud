package com.dayeliu.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dayeliu.cloud.entities.Dept;
import com.dayeliu.cloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	@RequestMapping(value = "/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept){
		return deptService.add(dept);
	}
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable Long id){
		return deptService.get(id);
	}
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> get(){
		return deptService.list();
	}
}
