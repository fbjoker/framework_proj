package com.atguigu.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * bean的后置处理器 
 * 	 
 *  	后置处理器会对IOC容器中的每个bean对象都起作用.
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	
	/**
	 *  在bean的生命周期中的  初始化方法  之前执行.
	 *  
	 *  Object bean:  当前正在创建的bean对象.
	 *  String beanName:  当前正在创建的bean对象的id值.
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("postProcessBeforeInitialization:" + bean  + " , " + beanName);
		
		return bean;
	}
	
	/**
	 * 在bean的生命周期中的   初始化方法  之后执行.
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization:" + bean  + " , " + beanName);
	
		return bean;
	}


}
