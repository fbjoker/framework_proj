package com.alex.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class ArithmeticCalculatorProxy2 {
	
	//1. 目标对象
	private ArithmeticCalculator  target ; 
	
	//2. 通过构造器的方式将目标对象传入
	
	public ArithmeticCalculatorProxy2(ArithmeticCalculator target) {
		this.target = target ; 
	}
	
	//3. 代理对象
	public Object  getProxy() throws Exception {
		Object proxy  = null ; 
		
		ClassLoader loader = target.getClass().getClassLoader();
		
		Class [] interfaces = target.getClass().getInterfaces();
		
		//获取到代理类的Class对象
		Class proxyClass  = Proxy.getProxyClass(loader, interfaces);
		
		//获取代理对象
		//1. 获取到代理类中的带参数构造器
		Constructor con = proxyClass.getDeclaredConstructor(InvocationHandler.class);
		
		//2. 执行构造器创建代理对象
		proxy  = con.newInstance(new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//获取方法的名字
				String methodName  = method.getName();
				
				//Logging log = new Logging();
				
				//记录日志
				//System.out.println("Proxy==>The method " + methodName + " begin with " + Arrays.toString(args));
				//log.beforeMethod(methodName, args);
				
				//执行目标对象的方法 , 也就是真正的 +  - *  /
				Object result = method.invoke(target, args);
				
				//记录日志
				//System.out.println("Proxy==>The method " + methodName + " end with "+ result  );
				//log.afterMethod(methodName, result);
				
				System.out.println("ArithmeticCalculatorProxy2+++++++++++++++++++");
				
				return result ;
			}
		});
		
		
		return proxy ; 
	}
}








