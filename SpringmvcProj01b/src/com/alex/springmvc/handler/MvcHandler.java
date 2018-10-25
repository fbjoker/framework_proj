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
public class MvcHandler {
	@Autowired
	DepartmentDao dd;
	@Autowired
	EmployeeDao ed;

	
	@RequestMapping(value="/showall")
	public String showall(Map<String,Object> map) {
		Collection<Employee> all = ed.getAll();
		
		map.put("emps", all);
		return "list";
	}
	@RequestMapping(value="emp",method=RequestMethod.GET)
	public String toAddPage(Map<String,Object> map) {
		
		Employee employee=new Employee();
		Map<String,String> gender=new HashMap<>();
		gender.put("0", "女");
		gender.put("1", "男");
		
		
		map.put("genders", gender);
		map.put("employee", employee);
		
		Collection<Department> departments = dd.getDepartments();
		map.put("depts", departments);
		
		
		
		
		return "update";
		
	}
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String addEmployee(Employee employee) {
		ed.save(employee);
		
		
		return "redirect:/showall";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String toeditEmployee(@PathVariable("id")Integer id,Map<String ,Object> map) {
		Employee employee = ed.get(id);
		
		map.put("employee", employee);
		
		
		Map<String,String> gender=new HashMap<>();
		gender.put("0", "女");
		gender.put("1", "男");
		
		
		map.put("genders", gender);
		
		
		Collection<Department> departments = dd.getDepartments();
		map.put("depts", departments);
		
		return "update";
		
	}
	
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String editEmployee(Employee employee) {
		System.out.println("11");
		ed.save(employee);
		
		
		return "redirect:/showall";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("id")Integer id) {
		ed.delete(id);
		
		return "redirect:/showall";
	}
	
	
}
