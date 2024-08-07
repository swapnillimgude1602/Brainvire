package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Get all employee
	public List<Employee> getAllEmployees() {
		List<Employee> list = (List<Employee>) this.employeeRepository.findAll();
		return list;
	}

	// get Employee By id
	public Employee getEmployeeById(int id) {

		Employee employee = null;
		try {
			employee = this.employeeRepository.findById(id);

		} catch (Exception e) {
			System.out.println(e);
		}
		return employee;
	}

	// Inserting Employee
	public Employee addEmployee(Employee employee) {
		Employee empSave = this.employeeRepository.save(employee);
		return empSave;
	}
	
	//deleting an employee
	public void deleteEmployee(int empId)
	{
		this.employeeRepository.deleteById(empId);
	}

	//Update Employee
	public Employee updateEmployee(Employee employee, int empId)
	{
		employee.setEmployeeId(empId);
		Employee emp= this.employeeRepository.save(employee);
		return emp;
		
	}
	
}
