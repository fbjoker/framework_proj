package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapperResultMap {
	
	//1.需求  查询员工信息 并且查询员工所在的部门信息
	public Employee selectEmployeeAndDeptById(Integer id );

	// 分步查询
	public Employee selectEmployeeAndDeptByIdStep(Integer id );
}

