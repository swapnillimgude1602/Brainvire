package section3_Lambda_W_Collection;

import java.util.ArrayList;
import java.util.Collections;

class Student
{
	int roll;
	String name;
	String Dept;
	
	Student(int r, String nm, String dt)
	{
		this.roll=r;
		this.name=nm;
		this.Dept=dt;
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", Dept=" + Dept + "]";
	}
	
	
}
public class Customizeclassobj_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student(101, "Swap", "10th"));
		st.add(new Student(121, "Swap", "10th"));
		st.add(new Student(111, "Swap", "10th"));
		st.add(new Student(105, "Swap", "10th"));
		
		System.out.println(st);	//unsorted
		Collections.sort(st, (s1,s2) -> ((s1.roll>s2.roll)?1:(s1.roll<s2.roll)?-1:0));	//lambda exp asec
		
		System.out.println(st);	//Sorted ascending
		
		Collections.sort(st, (s1,s2) -> ((s1.roll>s2.roll)?-1:(s1.roll<s2.roll)?1:0));	//lambda exp desc
		System.out.println(st);	//Sorted descending

	}

}
