package com.jaceksysiak.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/jaceksysiak/spring/aop/beans.xml");
 
		Object obj = context.getBean("camera");
		System.out.println("Class of camera bean: " + obj.getClass());
		System.out.println(obj instanceof Camera);
		System.out.println(obj instanceof PhotoSnapper);
		
		ICamera camera = (ICamera) context.getBean("camera");
		
		try {
			camera.snap();
		} catch (Exception e) {
			System.out.println("Cauth exception " + e.getMessage());
		}
		
		((ClassPathXmlApplicationContext)context).close();
		  
		  
	}

}
