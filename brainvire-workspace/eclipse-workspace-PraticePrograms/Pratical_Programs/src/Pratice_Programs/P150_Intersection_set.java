package Pratice_Programs;

import java.util.ArrayList;
import java.util.List;

public class P150_Intersection_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(15);
		list2.add(11);
		list2.add(12);
		
		list2.retainAll(list);
		//intersect
		System.out.println(list2);
 
	}

}
