package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.employeeRepository;

@SpringBootApplication
public class JpaSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = 	SpringApplication.run(JpaSpringbootApplication.class, args);
		employeeRepository emprepo = context.getBean(employeeRepository.class);
		
//		//Insert
//		Employee employee = new Employee();
//		employee.setEmployeeName("Swapnil Limgude");
//		employee.setEmployeeAddress("Pune");
//		
//		Employee employee1 = new Employee();
//		employee.setEmployeeName("Devendra Shinde");
//		employee.setEmployeeAddress("Shikrapur");
//		
//		
//		List<Employee> insertEmployee = List.of(employee,employee1);
//		Iterable<Employee> iteremployee = emprepo.saveAll(insertEmployee);
		
//		iteremployee.forEach(e->{
//			System.out.println(insertEmployee);
//		});
		
//		System.out.println("--Employee Inserted--");
		
		
		//Update
		
//		Optional<Employee> option = emprepo.findById(2);
//		Employee emp = option.get();
//		emp.setEmployeeName("Deva Shinde");
//		emp.setEmployeeAddress("Jategaon");
//		Employee result = emprepo.save(emp);
//		System.out.println("--Employee Updated-- "+result);
		
		
		//get single Employe
		Optional<Employee> option = emprepo.findById(2);
		Employee emp = option.get();
		System.out.println(emp);
		
		
		//get all Employees
		Iterable<Employee> itremp = emprepo.findAll();
		itremp.forEach(e->{
			System.out.println(e);
		});
		
		
		//delete Employee by id
		emprepo.deleteById(3);
		System.out.println("--Employee Deleted--");
		
		
		//delete all
		Iterable<Employee> deleteAll = emprepo.findAll();
		deleteAll.forEach(e->{
			System.out.println(e);
			emprepo.deleteAll(deleteAll);
		});
		System.out.println("--All Employees Deleted--");
		
		
//		List<Employee> emps = emprepo.findByemployeeNameAndemployeeAddress("Swapnil Limgude", "Pune");
//		emps.forEach(list->{
//			System.out.println(list);
//		});
//		
		 
		
		
	}

}
