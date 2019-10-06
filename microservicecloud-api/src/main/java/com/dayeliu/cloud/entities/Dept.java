package com.dayeliu.cloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * dept ->部门table
 * @author liuch
 *
 */
//告警
@SuppressWarnings("serial")
//全参构造
//@AllArgsConstructor
//空参构造
@NoArgsConstructor
//get set
@Data
//链式
@Accessors
public class Dept implements Serializable {
	private Integer deptno;// 部门id
	private String dname;// 部门名称
	// 使用的数据库 不同微服务使用不同的数据库
	private String db_source; 
}
