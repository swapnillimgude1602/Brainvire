package com.springcore.no_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student stud = (Student) context.getBean("getStudent",Student.class);
		System.out.println(stud);
		stud.study();
	}

}
