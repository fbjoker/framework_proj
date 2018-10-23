package com.alex.springmvc.handler;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.springmvc.beans.Department;
import com.atguigu.springmvc.beans.Employee;
import com.atguigu.springmvc.dao.DepartmentDao;
import com.atguigu.springmvc.dao.EmployeeDao;

@Controller
public class EmployeeHandler {
	@Autowired
	DepartmentDao dd;
	@Autowired
	EmployeeDao ed;
	
	@RequestMapping(value="/emps")
	public String findAllemp(Map<String, Object> map) {
		
		
		Collection<Employee> all = ed.getAll();
		map.put("emps", all);
		
		
		return "list";
		
	}
	
	
	@RequestMapping(value="/emp1",method=RequestMethod.GET)
	public String findDepartment(  Map<String, Object> map) {
		Collection<Department> departments = dd.getDepartments();
		map.put("depts", departments);
		return "update";
	}

	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String toaddEmp( Map<String, Object> map) {

		Map<String ,String> genders = new HashMap<String, String>();
		genders.put("0", "女");
		genders.put("1", "男");
		//command 用于回显数据用
		Employee employee = new Employee();
		System.out.println("ok");
		
		map.put("genders", genders);
		//map.put("command", employee);
		map.put("employee", employee);
		
		
		Collection<Department> departments = dd.getDepartments();
		map.put("depts", departments);
		
		
		return "update";
	}
	
	
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String addEmp( Employee employee) {
		System.out.println(employee);
		ed.save(employee);
		
		return "redirect:/emps";
		
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String toUpdatepage(@PathVariable("id")Integer id, Map<String, Object> map  ) {
		
		Map<String ,String> genders = new HashMap<String, String>();
		genders.put("0", "女");
		genders.put("1", "男");
		map.put("genders", genders);
		
		Employee employee = ed.get(id);
		map.put("employee", employee);
		
		Collection<Department> departments = dd.getDepartments();
		map.put("depts", departments);
		
		return "update";
	}
	@RequestMapping(value="/emp/{id}" ,method=RequestMethod.DELETE)
	public String delete(@PathVariable("id")Integer id ) {
		System.out.println("ok");
		ed.delete(id);
		
		
		
		return "redirect:/emps";
		
	}
	
	
	

}
