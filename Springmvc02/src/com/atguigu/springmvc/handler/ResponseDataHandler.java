package com.atguigu.springmvc.handler;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseDataHandler {
	
	/**
	 * Model 
	 * 	需要在请求 处理方法的形参中声明一个Model类型的形参
	 */
	@RequestMapping(value = "/testModel")
	public String  testModel(Model model ) {
		System.out.println("model: " + model.getClass().getName());
		//模型数据: loginUser = Root
		//设置模型数据
		model.addAttribute("loginUser", "Root");
		
		return "success";
	}
	/**
	 * Map
	 * 	需要在请求处理方法的形参中声明一个Map类型的形参.
	 * 
	 * 结论: 不论请求处理方法的返回值是String、ModelAndView、.. , Springmvc最终都会处理成一个ModelAndView对象.
	 * 
	 */
	@RequestMapping(value = "/testMap")
	public String testMap(Map<String,Object> map ) {
		System.out.println("map : " + map.getClass().getName());//org.springframework.validation.support.BindingAwareModelMap
		
		//模型数据: password = 123456
		//设置模型数据
		map.put("password", "123456");
		
		return "success";
	}
	
	
	
	/**
	 * ModelAndView
	 * 	需要将请求处理方法的返回值声明为ModelAndView类型.
	 * 
	 * 结论:  添加到ModelAndView中的模型数据，最终会被设置到Request域对象中.
	 */
	@RequestMapping(value="/testModelAndView")
	public ModelAndView  testModelAndView() {
		//模型数据:  username = Admin 
		
		//JavaWEB: request.setAttribute("username","Admin"); request.getRequestDispatcher("").forward(req,resp);	
		
		//Springmvc：
		//1. 创建ModelAndView对象
		ModelAndView mav = new  ModelAndView();
		
		//2. 添加模型数据
		mav.addObject("username", "Admin");
		
		//3. 设置视图信息
		mav.setViewName("success");
		
		return mav; 
		
	}
	
}
