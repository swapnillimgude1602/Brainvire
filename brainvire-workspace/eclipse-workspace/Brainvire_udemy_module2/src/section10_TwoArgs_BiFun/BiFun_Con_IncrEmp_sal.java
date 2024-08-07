package section10_TwoArgs_BiFun;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee1
{
	String employee_Name;
	double dailywage;
	
	Employee1(String employee_Name, double dailywage) {
		this.employee_Name = employee_Name;
		this.dailywage = dailywage;
	}
}
public class BiFun_Con_IncrEmp_sal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> al =new ArrayList<Employee1>();
		BiFunction<String, Double, Employee1> bf = (n,s) -> new Employee1(n,s);
		al.add(bf.apply("Swapnil", 10000.0));
		al.add(bf.apply("Devendra", 35000.0));
		al.add(bf.apply("Narendra", 45000.0));
		al.add(bf.apply("Sahil", 55000.0));
		
		BiConsumer<Employee1,Double> c = (e,d)->
			e.dailywage = e.dailywage + d;
			for(Employee1 e1 : al)
			{
				c.accept(e1, 1500.0);
			}

		for(Employee1 e2 : al)
		{
			System.out.println("Employee name: "+e2.employee_Name);
			System.out.println("Employee Salary: "+e2.dailywage);
			System.out.println();
		}
	}

}
