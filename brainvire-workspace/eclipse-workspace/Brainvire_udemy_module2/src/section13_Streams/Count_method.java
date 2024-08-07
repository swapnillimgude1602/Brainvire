package section13_Streams;

import java.util.ArrayList;

public class Count_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing method :- count()-
		 * it returns no of elements present in String.
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swapnil");
		list.add("Madhur");
		list.add("Devendra");
		list.add("Narendra");
		list.add("Sahil");
		
		long count = list.stream().count();
		System.out.println("Number of object in Stream : "+count);
		
		long count1 = list.stream().filter(i -> i.length()>=7).count();
		System.out.println("Number of object in Stream : "+count1);

	}

}
