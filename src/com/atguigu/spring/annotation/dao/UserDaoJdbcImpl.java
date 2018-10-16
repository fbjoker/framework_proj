package com.atguigu.spring.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoJdbcImpl implements UserDao {
	
	@Override
	public void insertUser() {
		System.out.println("UserDaoJdbcImpl  insertUser .....");
	}
}
