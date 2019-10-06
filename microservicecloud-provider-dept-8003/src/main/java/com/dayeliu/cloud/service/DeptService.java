package com.dayeliu.cloud.service;

import java.util.List;

import com.dayeliu.cloud.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
