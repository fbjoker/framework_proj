package com.alex.mapper;

import com.alex.bean.User;

public interface UserResultMapper {
	
	public User findUserByIdone(String did);
	public User findUserBydid(String did);
	public User findUserById(String id);
	public User findUserByIdassosiation(String id);
	public User findUserByIdassosiationstep(String id);
	

}
