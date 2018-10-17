package com.alex.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(1)
public class MyAspectj2 {
	@Pointcut(value="execution( * com.alex.aspect.*.*(..))")
	public void myPointcut(){}
	
	@Before(value="myPointcut()")
	public void beforeMethod(JoinPoint joinPoint) {
		
		System.out.println("级别较低的aspect:");
		
		
	}
	
	@Around(value="MyAspectj.myPointcut()")
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		
		try {
			System.out.println("环绕前");
			
			Object proceed = pjp.proceed();
			
			System.out.println("环绕后");
			return proceed;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("异常");
		}finally {
			System.out.println("retrun");//?获得返回值
		}
		
		return 0;
	}
	
	 

}
