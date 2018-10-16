package com.atguigu.spring.datasource;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

public class Main {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("spring-datasource.xml");
		
		//DruidDataSource ds = ctx.getBean("dataSource",DruidDataSource.class);
		
		DataSource ds = ctx.getBean("dataSource",DataSource.class);
		
		System.out.println("ds:" + ds );
		
		System.out.println(ds.getConnection());
		
	}
}
