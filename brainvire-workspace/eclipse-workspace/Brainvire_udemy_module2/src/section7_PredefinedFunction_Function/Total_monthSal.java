package section7_PredefinedFunction_Function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
	double employeeSalary;
	String employee_Name;

	public Employee(double employeeSalary, String employee_Name) {

		this.employee_Name = employee_Name;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + ", employee_Name=" + employee_Name + "]";
	}

}

public class Total_monthSal {

	public static void populateEmployee(ArrayList<Employee> list) {

		list.add(new Employee(40000, "Sahil Borhade"));
		list.add(new Employee(50000, "Swapnil Limgude"));
		list.add(new Employee(70000, "Devendra Shinde"));
		list.add(new Employee(80000, "Madhuri Limgude"));
		list.add(new Employee(85000, "Narendra Borhade"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> al = new ArrayList<Employee>();
		populateEmployee(al);
		System.out.println(al);

		Function<ArrayList<Employee>, Double> f = e -> {
			double total = 0;
			for (Employee ee : al) {
				total = total + ee.employeeSalary;
			}
			return total;

		};
		
		System.out.println("Total Salary: " + f.apply(al));

	}

}
