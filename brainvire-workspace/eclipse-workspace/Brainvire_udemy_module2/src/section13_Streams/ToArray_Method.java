package section13_Streams;

import java.util.ArrayList;

public class ToArray_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Processing Method - toArray()-
		 * copies element present inside stream into an Specified array.
		 * 
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		System.out.println(list);

		Integer arr[] = list.stream().toArray(Integer[]::new);	//converts elements present in stream into array.
		for(Integer i : arr)
		{
			System.out.println(i);
		}
	}

}
