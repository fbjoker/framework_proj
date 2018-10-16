package com.atguigu.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-autowire.xml");
		
		Person person = ctx.getBean("person",Person.class);
		
		System.out.println("person: " + person );
	}
}
