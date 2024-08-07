package section8_PredefinedFunction_Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	int student_Roll;
	String student_Name;
	int student_Phoneno;
	int student_Marks;
	
	public Student(int student_Roll, String student_Name, int student_Marks, int student_Phoneno) {
		
		this.student_Roll = student_Roll;
		this.student_Name = student_Name;
		this.student_Phoneno = student_Phoneno;
		this.student_Marks = student_Marks;
	}
}

public class Display_StudentInfo {
	
	public static void populateStudent(ArrayList<Student> list) {
		list.add(new Student(120, "Sahil Borhade",34,12345678));
		list.add(new Student(121, "Swapnil Limgude",50,12345678));
		list.add(new Student(123, "Devendra Shinde",68,12345678));
		list.add(new Student(124, "Madhuri Limgude",46,12345678));
		list.add(new Student(125, "Narendra Borhade",87,12345678));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		populateStudent(al);
		
		//to put Condition
		Predicate <Student> p = m -> m.student_Marks>60;
		
		//to perform certain operation 
		Function<Student , String> f = s ->{
			int marks = s.student_Marks;

			if (marks >= 80)
				return "A[Distinction]";
			else if (marks >= 60)
				return "B[Second Class]";
			else if (marks >= 50)
				return "C[Third Class]";

			return "fail";

		};
		
		//to print/consume 
		Consumer<Student> c = d -> {
			System.out.println("Student Roll Number : "+d.student_Roll);
			System.out.println("Student Roll Name : "+d.student_Name);
			System.out.println("Student Grade : "+f.apply(d));
			System.out.println("Student Roll Phone Number : "+d.student_Phoneno);

		};
		
		for(Student s :al)
		{
			if(p.test(s))
				c.accept(s);
			System.out.println();
		}
		

	}

}
