package com.atguigu.spring.beans;

public class Employee {
	
	private  Integer id ; 
	
	private  String lastName ;
	
	private  Department dept ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", dept=" + dept + "]";
	} 
	
	
}
