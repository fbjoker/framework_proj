package com.atguigu.spring.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.annotation.controller.UserController;
import com.atguigu.spring.annotation.dao.UserDao;
import com.atguigu.spring.annotation.service.UserService;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-annotation.xml");
		
		//UserController
		UserController  uc = ctx.getBean("userController",UserController.class);
		System.out.println("uc: " +  uc );
		
		uc.regist();
		
		//UserService
//		UserService  us = ctx.getBean("userServiceImpl",UserService.class);
//		System.out.println("us: " + us );
		
		//UserDao
//		UserDao  ud = ctx.getBean("userDaoJdbcImpl",UserDao.class);
//		System.out.println("ud: " + ud );
		
		
	}
}
