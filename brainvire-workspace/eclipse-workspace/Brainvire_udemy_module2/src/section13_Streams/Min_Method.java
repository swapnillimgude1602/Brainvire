package section13_Streams;

import java.util.ArrayList;

public class Min_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing Method - min(Comparator c)
		 * it returns minimum value from stream according to specified comparator
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimun Value :"+min);

	}

}
