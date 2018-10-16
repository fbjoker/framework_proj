package com.atguigu.spring.aop.before;

public class Main {
	
	public static void main(String[] args) {
		
		ArithmeticCalculator ac = new ArithmeticCalculatorImpl();
		
		int result = ac.add(1, 1);
		
		System.out.println("Main result : " + result );
		
	}
}
