package Pratice_Programs;

import java.util.HashSet;
import java.util.Set;

public class P152_Check_Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		System.out.println("lETTERS: " + set1);

		// create the second set
		Set<String> set2 = new HashSet<>();
		set2.add("A");
		set2.add("D");
		set2.add("C");
		System.out.println("lETTERS: " + set2);

		boolean result = set1.containsAll(set2);
		System.out.println("Check for subset= " + result);
	}

}
