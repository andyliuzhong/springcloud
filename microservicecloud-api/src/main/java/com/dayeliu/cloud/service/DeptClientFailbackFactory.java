package com.dayeliu.cloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dayeliu.cloud.entities.Dept;

import feign.hystrix.FallbackFactory;
/**
 * hystrix
 * @author liuch
 *
 */
@Component
public class DeptClientFailbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(long id) {
				// TODO Auto-generated method stub
				return new Dept().setDeptno(id).setDname("该ID："+id +"没有对应的信息")
						.setDb_source("no this datasource");
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
