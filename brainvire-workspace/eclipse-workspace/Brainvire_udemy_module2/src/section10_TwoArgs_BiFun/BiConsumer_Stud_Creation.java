package section10_TwoArgs_BiFun;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student
{
	int student_rollNo;
	String student_Name;

	public Student(int student_rollNo, String student_Name) {

		this.student_rollNo = student_rollNo;
		this.student_Name = student_Name;
	}
}

public class BiConsumer_Stud_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		
		BiFunction<Integer, String, Student> bf = (rollno , name) ->new Student(rollno,name);
		al.add(bf.apply(101, "Swapnil"));
		al.add(bf.apply(102, "Devendra"));
		al.add(bf.apply(103, "Sahil"));
		al.add(bf.apply(104, "Naren"));

		for(Student s: al)
		{
			System.out.println("Roll_no: "+s.student_rollNo);
			System.out.println("Name: "+s.student_Name);
			System.out.println();
		}
	}

}
