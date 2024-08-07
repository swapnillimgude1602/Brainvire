package com.springcore.constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor_Injection/personconfig.xml");
		Person per1=(Person)context.getBean("per");
		System.out.println(per1);

	}

}
