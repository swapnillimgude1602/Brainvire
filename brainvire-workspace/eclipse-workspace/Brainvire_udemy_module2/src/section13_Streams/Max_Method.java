package section13_Streams;

import java.util.ArrayList;

public class Max_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Processing Method - max(Comparator c)
		 * it returns maximum value from stream according to specified comparator
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimun Value :"+max);

	}

}
