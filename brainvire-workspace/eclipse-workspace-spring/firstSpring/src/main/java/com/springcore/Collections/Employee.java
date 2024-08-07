package com.springcore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phoneno;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties props;
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(List<String> phoneno) {
		this.phoneno = phoneno;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Employee(String name, List<String> phoneno, Set<String> address, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
		this.courses = courses;
		this.props = props;
	}
	
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneno=" + phoneno + ", address=" + address + ", courses=" + courses
				+ ", props=" + props + "]";
	}
	
	
	
}
