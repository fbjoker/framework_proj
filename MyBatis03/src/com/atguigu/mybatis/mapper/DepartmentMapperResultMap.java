package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.beans.Department;

public interface DepartmentMapperResultMap {
	
	public  Department  selectDepartmentById(Integer id );
	
	
	public Department  selectDeparmentAndEmpsById(Integer id );
}
