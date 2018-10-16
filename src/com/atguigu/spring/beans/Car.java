package com.atguigu.spring.beans;

public class Car {
	
	private String  brand ;
	
	private String  price ;
	
	public Car() {
		System.out.println("==>1. 调用构造器创建Bean对象");
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("==>2. 调用set方法给bean的属性赋值");
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	} 
	
	
	/**
	 * 初始化方法
	 */
	public void initMethod() {
		System.out.println("==>3. 调用初始化方法");
	}
	
	/**
	 * 销毁方法
	 */
	public void destroyMethod() {
		System.out.println("==>5. 调用销毁方法");
	}
}
