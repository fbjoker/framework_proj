package com.alex.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alex.spring.Department;
import com.alex.spring.User;

public class Testioc {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User bean = context.getBean("user1",User.class);
		System.out.println(bean);
		
		Department department = context.getBean("department",Department.class);
		System.out.println(department);
		
	}

}
