package com.alex.proxy;

import org.springframework.stereotype.Component;

/**
 * 
 * 需求: 在加减乘除运算的前后加上日志。
 * 
 * 
 * 问题:
 * 	1. 代码分散
 *  2. 代码混乱
 *  
 * 思路:
 * 	 将日志功能从核心业务方法中抽取出去，单独定义到某个位置，再借助于一些技术动态的作用到核心业务方法上 . 
 * 
 *
 */
@Component
public class ArithmeticCalculatorImpl  implements ArithmeticCalculator{

	@Override
	public int add(int i, int j) {
		int result = i + j ;
		return result ;
	}

	@Override
	public int sub(int i, int j) {
		int result = i -  j ; 
		return result ;
	}

	@Override
	public int mul(int i, int j) {
		int result = i * j ; 
		return result ;
	}

	@Override
	public int div(int i, int j) {
		int result = i /  j ; 
		return result ;
	}
	
}
