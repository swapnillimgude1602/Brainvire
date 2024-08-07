package section7_PredefinedFunction_Function;

import java.util.function.Predicate;
import java.util.function.Function;

import java.util.ArrayList;

class Employee1 {
	double employeeSalary;
	String employee_Name;

	public Employee1(double employeeSalary, String employee_Name) {

		this.employee_Name = employee_Name;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + ", employee_Name=" + employee_Name + "]";
	}

}

public class SalaryIncrementUsing_P_F {

	public static void populateEmployee(ArrayList<Employee> list) {

		list.add(new Employee(40000, "Sahil Borhade"));
		list.add(new Employee(50000, "Swapnil Limgude"));
		list.add(new Employee(70000, "Devendra Shinde"));
		list.add(new Employee(80000, "Madhuri Limgude"));
		list.add(new Employee(85000, "Narendra Borhade"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> al1 = new ArrayList<Employee>();
		populateEmployee(al1);
		System.out.println("Before Increment :\n"+al1);

		Predicate<Employee> p = e -> e.employeeSalary > 70000;
		Function<Employee, Employee> f = e1 -> {
			e1.employeeSalary = e1.employeeSalary + 10000;

			return e1;
		};

		ArrayList<Employee> al2 = new ArrayList<>();
		for (Employee e : al1) {
			if (p.test(e))
				f.apply(e);
			al2.add(e);
		}
		System.out.println();
		System.out.println("After Increment \n" + al1);
		System.out.println();
		System.out.println("Employee name with incremented Salary \n" + al2);
	}

}
