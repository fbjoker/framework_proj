package com.alex.proxy;

import java.util.Arrays;

public class Alogging {
	
	
	public void beforMethod(String name,Object[] args) {
		System.out.println(name+"befor..........................."); 
		System.out.println(Arrays.toString(args)); 
	}
	
	
	public void afterMethod(String name,Object[] args) {
		System.out.println(name+"..........................."); 
		System.out.println(Arrays.toString(args)); 
	}

}
