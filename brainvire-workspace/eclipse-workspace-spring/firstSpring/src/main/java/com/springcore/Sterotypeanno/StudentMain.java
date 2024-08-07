package com.springcore.Sterotypeanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Sterotypeanno/steroconfig.xml");
		Student stud = (Student)context.getBean("object");
		System.out.println(stud);
		System.out.println(stud.getAdd());
		System.out.println(stud.getAdd().getClass());
		
	}

}
