package Pratice_Programs;

import java.util.HashSet;
import java.util.Set;

public class P149_Union_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("Swapnil");
		set1.add("Maruti");
		set1.add("Limgude");

		Set<String> set2 = new HashSet<String>();
		set2.add("Madhuri");
		set2.add("Nitin");
		set2.add("Barhate");

		set2.addAll(set1);
		//union
		for (String union : set2) {
			System.out.println(union);
		}

	}

}
