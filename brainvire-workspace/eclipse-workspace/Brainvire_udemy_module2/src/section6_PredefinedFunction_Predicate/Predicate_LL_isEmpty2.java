package section6_PredefinedFunction_Predicate;

import java.util.ArrayList;
import java.util.Collection;

public class Predicate_LL_isEmpty2 {

	@SuppressWarnings("rawtypes") // warns that you are using a raw type instead of a parameterized type
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Collection> p = c -> c.isEmpty(); // check for empty list

		ArrayList<String> al = new ArrayList<>(); 
		al.add("Swap");
		System.out.println(p.test(al));

		ArrayList<String> al1 = new ArrayList<>();
		System.out.println(p.test(al1));

	}

}
