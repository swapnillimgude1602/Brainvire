package section13_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing Method :- sorted()- 
		 * it is used to sort method inside stream
		 * sorted() - default natural sorting order -Ascending
		 * sorted(comparator c) - customized sort [ compareTo() ].
		 */

		//NATURAL SORTING ORDER - sorted()
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swapnil");
		list.add("Madhur");
		list.add("Devendra");
		list.add("Narendra");
		list.add("Sahil");
		
		List<String> l = list.stream().sorted().collect(Collectors.toList());
		System.out.println(l);
		

	}

}
