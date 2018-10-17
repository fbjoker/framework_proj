package com.alex.aspect.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArithmeticCalculator bean = context.getBean("a1",ArithmeticCalculator.class);
		bean.add(4, 4);
		
		System.out.println("==================");
		//bean.div(4, 0);异常
	}

}
