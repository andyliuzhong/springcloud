package com.dayeliu.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dayeliu.cloud.dao.DeptDao;
import com.dayeliu.cloud.entities.Dept;
import com.dayeliu.cloud.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao deptdao;
	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return deptdao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return deptdao.findById(id);
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return deptdao.findAll();
	}

}
