package com.alex.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
	
	private ArithmeticCalculatorImpl target;

	public TestProxy(ArithmeticCalculatorImpl target) {
		this.target = target;
		
	}
	
	
	public Object getProxy() {
		
		Object newProxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				
				Object invoke = method.invoke(proxy, args);
				return invoke;
			}
		});
		
		return newProxyInstance;
	}

	
	
	

}
