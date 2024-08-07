package section13_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing Method :- collect()- 
		 * collects element from streams and adding to specified Condition. 
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swapnil");
		list.add("Madhur");
		list.add("Devendra");
		list.add("Narendra");
		list.add("Sahil");
		
		List<String> l = list.stream().filter(s -> s.length()>5).collect(Collectors.toList());
		System.out.println(l);

	}

}
