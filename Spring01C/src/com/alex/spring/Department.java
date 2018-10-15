package com.alex.spring;

import java.util.List;
import java.util.Map;

public class Department {
	
	 private Integer id;
	 private String name;
	 private User user;
	 private List<User> userlist;
	 private Map<String,User> usermap;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer id, String name, User user, List<User> userlist, Map<String, User> usermap) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.userlist = userlist;
		this.usermap = usermap;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUserlist() {
		return userlist;
	}
	public void setUserlist(List<User> userlist) {
		this.userlist = userlist;
	}
	public Map<String, User> getUsermap() {
		return usermap;
	}
	public void setUsermap(Map<String, User> usermap) {
		this.usermap = usermap;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", user=" + user + ", userlist=" + userlist + ", usermap="
				+ usermap + "]";
	}
	 
	 
	 
	 

}
