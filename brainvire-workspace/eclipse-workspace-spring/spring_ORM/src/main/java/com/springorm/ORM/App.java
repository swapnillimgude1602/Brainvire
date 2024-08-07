package com.springorm.ORM;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.Entity.Employee;
import com.springorm.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello World!");
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/ORM/config.xml");
		EmployeeDao employeedao = context.getBean("employeeDao", EmployeeDao.class);
   
		while (true) {
			System.out.println("Press 1 to add new Employee.");
			System.out.println("Press 2 to Update Employee.");
			System.out.println("Press 3 to Display Employee by ID.");
			System.out.println("Press 4 to Display All Employees.");
			System.out.println("Press 5 to Delete Employee.");
			System.out.println("Press 6 to Exit.");

			System.out.println("Press: ");
			int choice = scanner.nextInt();

			try {

				switch (choice) {
				case 1:
					try {
					System.out.println("Enter Employee Id ");
					int id = scanner.nextInt();
					System.out.println("Enter Employee Name ");
					String name = scanner.next();
					System.out.println("Enter Employee Address ");
					String add = scanner.next();
					
					Employee employee = new Employee(id,name,add);
			        int res = employeedao.insertEmployee(employee);
			        System.out.println("Employee Added :"+res);
					}
					catch(InputMismatchException e) {
						System.out.println("--Input Mismatched--"+e);
					}
					break;

				case 2:
					
					System.out.println("Enter Employee Id ");
					int id = scanner.nextInt();
					System.out.println("Enter Employee Name ");
					String name = scanner.next();
					System.out.println("Enter Employee Address ");
					String add = scanner.next();
					
					Employee empUpdate = new Employee(id,name,add);
					employeedao.updateEmployee(empUpdate);
					System.out.println("Employee Updated");
					break;

				case 3:
					System.out.println("Enter the EmployeeId You want to Search: ");
					int searchid = scanner.nextInt();
					Employee emp = employeedao.getEmployee(searchid);
					System.out.println(emp);
					break;

				case 4:
					List<Employee> all = employeedao.getAllEmployees();
					System.out.println(all);
					break;

				case 5:
					System.out.println("Enter Employee Id You want to delete: ");
					int empid = scanner.nextInt();
					employeedao.deleteEmployee(empid);
					System.out.println("--Employee Deleted--");
					break;

				case 6:
					System.exit(0);
					break;

				}

			} catch (Exception e) {
				System.out.println("---Invalid Input---");
				System.out.println(e.getMessage());
			}
//			System.out.println("---Exited---");
//			scanner.close();
		}

	}
}
