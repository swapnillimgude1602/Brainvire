package section7_PredefinedFunction_Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	int Student_marks;
	String Student_name;

	public Student(int student_marks, String student_name) {

		Student_marks = student_marks;
		Student_name = student_name;
	}

}

public class Find_gradeOfStudent {

	public static void populateStudent(ArrayList<Student> list) {
		list.add(new Student(40, "Sahil Borhade"));
		list.add(new Student(50, "Swapnil Limgude"));
		list.add(new Student(70, "Devendra Shinde"));
		list.add(new Student(80, "Madhuri Limgude"));
		list.add(new Student(85, "Narendra Borhade"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> al = new ArrayList<Student>();
		populateStudent(al);

		Function<Student, String> f = s -> {
			int marks = s.Student_marks;

			if (marks >= 80)
				return "A[Distinction]";
			else if (marks >= 60)
				return "B[Second Class]";
			else if (marks >= 50)
				return "C[Third Class]";

			return "fail";

		};

		for (Student s : al) {
			System.out.println("Student Marks: " + s.Student_marks);
			System.out.println("Student Name: " + s.Student_name);
			System.out.println("Student Grade: " + f.apply(s));
			System.out.println();

		}

		// if condition check
		System.out.println("**Condition Check**");
		Predicate<Student> p = s -> s.Student_marks >= 60;
		for (Student s : al) {
			if (p.test(s)) {
				System.out.println("Student Marks: " + s.Student_marks);
				System.out.println("Student Name: " + s.Student_name);
				System.out.println("Student Grade: " + f.apply(s));
				System.out.println();

			}
		}

	}

}
