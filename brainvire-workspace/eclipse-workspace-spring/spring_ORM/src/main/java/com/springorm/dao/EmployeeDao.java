package com.springorm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorm.Entity.Employee;


public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	//insert save employee
	@Transactional
	public int insertEmployee(Employee employee) {
		Integer save = (Integer) this.hibernateTemplate.save(employee);
		return save;
		
	}
	
	
	//Get single Employee
	public Employee getEmployee(int employeeID) {
		Employee employee = this.hibernateTemplate.get(Employee.class, employeeID);
		return employee;
		
	}
	
	//get all Employee
	public List<Employee> getAllEmployees(){
		List<Employee> employees =  this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	}
	
	//delete employee
	@Transactional
	public void deleteEmployee(int employeeid) {
		Employee employee = this.hibernateTemplate.get(Employee.class, employeeid);
		this.hibernateTemplate.delete(employee);
	}
	
	//Updating Employee
	@Transactional
	public void updateEmployee(Employee employee) {
		
		this.hibernateTemplate.update(employee);
	}
}
