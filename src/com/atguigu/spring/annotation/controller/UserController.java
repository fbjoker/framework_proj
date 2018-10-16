package com.atguigu.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *  @Controller注解的作用就相当于在xml中做如下的配置:
 *  	<bean id="userController" class="com.atguigu.spring.annotation.controller.UserController">
 * 	    </bean>
 * 
 * 		默认情况下， 通过注解将组件管理到IOC容器中时，id为类名首字母小写. 
 * 		也可以通过注解的value属性来指定id：@Controller(value="uc")
 *		如果说在注解中只会指定一个value属性的情况, value可以省略：@Controller("uc")
 */

import com.atguigu.spring.annotation.service.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService ; 
	
	
	public void  regist() {
		
		userService.doRegist();
	}
	
}
