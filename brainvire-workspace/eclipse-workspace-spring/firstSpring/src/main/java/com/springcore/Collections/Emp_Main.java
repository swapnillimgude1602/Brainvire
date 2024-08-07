package com.springcore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Collections/Empconfig.xml");
		Employee emp1=(Employee)context.getBean("emp");
		System.out.println(emp1);
		System.out.println("Name "+emp1.getName());
		System.out.println("Address "+emp1.getAddress());
		System.out.println("Courses "+emp1.getCourses());
		System.out.println("Properties "+emp1.getProps());

	}

}
