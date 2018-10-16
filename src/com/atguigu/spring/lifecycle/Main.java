package com.atguigu.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.spring.beans.Car;

public class Main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =
					new ClassPathXmlApplicationContext("spring-lifecycle.xml");
		
		Car car = ctx.getBean("car",Car.class);
		
		System.out.println("==>4. 使用bean " +  car );
		
		//关闭容器
		ctx.close();
	}
}
