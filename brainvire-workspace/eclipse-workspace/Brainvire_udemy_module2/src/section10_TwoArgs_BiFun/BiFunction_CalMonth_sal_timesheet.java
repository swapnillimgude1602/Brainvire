package section10_TwoArgs_BiFun;

import java.util.function.BiFunction;

class Employee
{
	int employee_Id;
	String employee_Name;
	double dailywage;
	
	public Employee(int employee_Id, String employee_Name, double dailywage) {
		this.employee_Id = employee_Id;
		this.employee_Name = employee_Name;
		this.dailywage = dailywage;
	}
}

class TimeSheet
{
	int employee_Tno;
	int days;
	
	public TimeSheet(int employee_Tno, int days) {
		this.employee_Tno = employee_Tno;
		this.days = days;
	}
}
public class BiFunction_CalMonth_sal_timesheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(101,"Swapnil", 1505);
		TimeSheet sheet = new TimeSheet(101, 30);
		
		BiFunction<Employee, TimeSheet, Double> bf = (e,t) ->
			e.dailywage*t.days;
		System.out.println("Monthly Salary: "+bf.apply(employee, sheet));
	}

}
