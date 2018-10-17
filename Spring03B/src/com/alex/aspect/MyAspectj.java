package com.alex.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(2)
public class MyAspectj {
	@Pointcut(value="execution( * com.alex.aspect.*.*(..))")
	public void myPointcut(){}
	
	@Before(value="myPointcut()")
	public void beforeMethod(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("before------------aspect:"+name+Arrays.toString(args));
		
		
	}
	
	
	@After(value="myPointcut()")
	public void afterMethod(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		//Object[] args = joinPoint.getArgs();
		System.out.println("after------------aspect:"+name);
		
		
	}
	
	 @AfterReturning(value="myPointcut()" ,returning="res")
	public void returnMethod(JoinPoint joinPoint, Object res) {
		String name = joinPoint.getSignature().getName();
		//Object[] args = joinPoint.getArgs();
		System.out.println("after------------aspect:"+name+res.toString());
				
	}
	 @AfterThrowing(value="myPointcut()" ,throwing="ex")
	public void errMethod(JoinPoint joinPoint, Exception ex) {
		String name = joinPoint.getSignature().getName();
		// Object[] args = joinPoint.getArgs();
		System.out.println("after------------aspect:" + name + ex.toString());

	}
	 
	 
	 
	 
	 

}
