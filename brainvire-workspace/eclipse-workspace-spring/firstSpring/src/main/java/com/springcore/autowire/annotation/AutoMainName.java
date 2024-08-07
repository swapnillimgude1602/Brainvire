package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMainName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireconfigType.xml");
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		

	}

} 
