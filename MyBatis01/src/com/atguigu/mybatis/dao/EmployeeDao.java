package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeDao {
	
	public Employee selectEmployeeById(Integer id );
	
	public void updateEmployee(Employee employee);
	
	public void insertEmployee(Employee employee);
	
	public void deleteEmployeeById(Integer id );
}
