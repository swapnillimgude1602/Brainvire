package Pratice_Programs;

import java.util.HashSet;
import java.util.Set;

public class P151_Difference_2_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<>();
		set1.add("Swapnil");
		set1.add("Maruti");
		set1.add("Limgude");

		Set<String> set2 = new HashSet<>();
		set2.add("Madhuri");
		set2.add("Maruti");
		set2.add("Limgude");

		set1.removeAll(set2);

		System.out.println("Difference between the sets: " + set1);

	}

}
