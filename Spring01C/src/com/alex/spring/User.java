package com.alex.spring;

public class User {
	
	String name;
	Integer id;
	public User(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
	
	

}
