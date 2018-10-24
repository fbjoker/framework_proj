package com.alex.springmvc.handler;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.springmvc.beans.Employee;
import com.atguigu.springmvc.dao.EmployeeDao;

@Controller
public class MyTestHandler {

	@Autowired
	EmployeeDao ed;
	
	@ResponseBody
	@RequestMapping(value="getJson")
	public  Collection<Employee> getJson() {
		
		Collection<Employee> all = ed.getAll();
		return  all;
	}
	@ResponseBody
	@RequestMapping(value="getEmployee")
	public  Employee getEmployee() {
		
		Employee employee = ed.get(1001);
		return  employee;
	}
	
	
	
	
	
}
