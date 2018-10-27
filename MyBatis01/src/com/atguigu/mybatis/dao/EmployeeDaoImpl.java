package com.atguigu.mybatis.dao;

import org.apache.ibatis.session.SqlSession;

import com.atguigu.mybatis.beans.Employee;

public class EmployeeDaoImpl  implements EmployeeDao{
	
	//@Autowired
	private SqlSession session ; 

	@Override
	public Employee selectEmployeeById(Integer id) {
		//JDBC 
		//DBUtils
		//JdbcTemplate
		//Mybatis SqlSession 
		
	//	session.selectOne(statement)
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		//session.update(statement)
	}

	@Override
	public void insertEmployee(Employee employee) {
		
		//session.insert(statement)
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		//session.delete(statement)
	}
	
}
