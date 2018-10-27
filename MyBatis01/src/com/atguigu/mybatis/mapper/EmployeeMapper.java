package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapper {
	
	public Employee selectEmployeeById(Integer id );
	
	public Integer insertEmployee(Employee employee);
	
	public Long  updateEmployee(Employee employee);
	
	public Boolean deleteEmployeeById(Integer id );
}
