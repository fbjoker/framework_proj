package com.atguigu.spring.annotation.dao;

import org.springframework.stereotype.Repository;

//@Repository(value="userDao")
@Repository
public class UserDaoMyBatisImpl  implements UserDao{

	@Override
	public void insertUser() {
		System.out.println("UserDaoMyBatisImpl insertUser......");
	}

}
