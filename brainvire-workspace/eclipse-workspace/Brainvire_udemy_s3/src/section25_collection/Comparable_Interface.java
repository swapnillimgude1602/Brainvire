package section25_collection;

import java.util.ArrayList;
//order obj of userdefine class
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rn, String nm, int age) {
		super();
		this.rollno = rn;
		this.name = nm;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (age == o.age)
			return 0;

		else if (age > o.age)
			return 1;

		else
			return -1;

	}

}

public class Comparable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> as = new ArrayList<Student>();
		as.add(new Student(1, "abc", 23));
		as.add(new Student(2, "pqr", 25));
		as.add(new Student(3, "xyz", 21));

		for (Student st : as) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
	}

}
