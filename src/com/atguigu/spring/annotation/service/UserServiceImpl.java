package com.atguigu.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.spring.annotation.dao.UserDao;

@Service
public class UserServiceImpl  implements UserService{
	
	
	/**
	 * @Autowired工作机制：
	 * 		首先会使用byType的方式进行装配 , 如果能唯一匹配，则装配成功，
	 * 		如果匹配到多个兼容 类型的bean, 再通过byName的方式进行唯一性确定，
	 * 		如果能唯一确定，则装配成功，否则，装配失败.
	 * 
	 * 默认情况下标注了@Autowired注解， 就必须要进行装配。 如果匹配不到能够进行装配的bean，则抛出异常
	 * 可以通过required来设置为不是必须的。 
	 * 
	 * @Qualifier 具体指定要装配的bean的id值.
	 * 
	 * @Qualifier  @Autowired 既可以加在属性上， 也可以加在带有参数的方法上. 
	 * 
	 * 
	 */
	@Autowired(required=false)
	@Qualifier(value="userDaoJdbcImpl")
	private UserDao  userDao ; 
	
	/*
	@Autowired(required=false)
	@Qualifier(value="userDaoJdbcImpl")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	*/
	
	@Override
	public void doRegist() {
		userDao.insertUser();
	}

}
