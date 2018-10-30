package com.alex.bean;

import java.util.List;

public class Department {
	private Integer id;
	private String deptName;
	private List<User> user;
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Department(Integer id, String deptName, List<User> user) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.user = user;
	}





	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}




	public List<User> getUser() {
		return user;
	}





	public void setUser(List<User> user) {
		this.user = user;
	}





	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", user=" + user + "]";
	}





	

}
