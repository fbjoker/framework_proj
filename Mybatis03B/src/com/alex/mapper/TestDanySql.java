package com.alex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.alex.bean.User;

public interface TestDanySql {
	
	public User testIF(User user);
	public List<User> testchoose(User user);
	public List<User> testTrim(User user);
	public Integer testSet(User user);
	
	
	
	public List<User> batchFind(@Param("ids")List<Integer> ids);
	
	public Integer batchAdd(@Param("users")List<User> users);
	public Integer batchDelete(@Param("ids2")List<Integer> ids);
	
	
	public Integer batchUpdate(@Param("users2")List<User> users);

}
