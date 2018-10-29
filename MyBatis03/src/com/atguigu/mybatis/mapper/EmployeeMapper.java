package com.atguigu.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.atguigu.mybatis.beans.Employee;

public interface EmployeeMapper {

	//1. 查询一条数据返回一个对象
	public Employee  selectEmployeeById(Integer id );
	
	//2. 查询多条数据返回多个对象的集合. 
	public List<Employee> selectEmployees();
	
	//3. 查询一条数据返回一个Map:{key(结果集的列名):value(结果集的列值)}
	public Map<String, Object> selectEmployeeByIdReturnMap (Integer id );
	
	//4. 查询多条数据返回一个Map 
	@MapKey("id")  // 指定使用对象的哪个属性作为Map的key. 
	public  Map<Integer,Employee > selectEmployeesReturnMap();
}
