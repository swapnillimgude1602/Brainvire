package com.springcore.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ReferenceType/refconfig.xml");
		Student stud = (Student) context.getBean("studref");
		System.out.println(stud);

	}

}
