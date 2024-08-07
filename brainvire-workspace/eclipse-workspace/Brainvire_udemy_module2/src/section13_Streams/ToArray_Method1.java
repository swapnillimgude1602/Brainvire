package section13_Streams;

import java.util.ArrayList;

public class ToArray_Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("Pqr");
		list.add("Xyz");
		list.add("Def");
		
		System.out.println(list);

		String arr[] = list.stream().toArray(String[]::new);	//converts elements present in stream into array.
		for(String i : arr)
		{
			System.out.println(i);
		}

	}

}
