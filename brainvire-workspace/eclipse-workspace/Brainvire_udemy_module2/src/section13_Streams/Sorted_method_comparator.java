package section13_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_method_comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * sorted(comparator c) - customized sort [ compareTo() ]
		 */
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		System.out.println("--Ascending--");
		List<Integer> l = list.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l);
		
		System.out.println("--Descending--");
		List<Integer> l1 = list.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2 = list.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l2);

	}

}
