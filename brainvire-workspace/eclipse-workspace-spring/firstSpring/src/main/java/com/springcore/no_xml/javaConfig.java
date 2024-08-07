package com.springcore.no_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcore.no_xml")
public class javaConfig {
	@Bean
	public Student getStudent() {
		Student stud = new Student();	//creating student object
		return stud;
	}
}
