package section13_Streams;

import java.util.ArrayList;

public class ForEach_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Processing Method - forEach()
		 * this method can take lambda exp as argument anf apply lambda exp for each element present in stream
		 * wont return anything
		 * 
		 */
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swapnil");
		list.add("Madhur");
		list.add("Devendra");
		list.add("Narendra");
		list.add("Sahil");
		
		//Using lambda Expression
		System.out.println("--Lambda Expression--");
		list.stream().forEach(s -> System.out.println(s));
		
		//Using Method Reference.
		System.out.println("--Method Reference--");
		list.stream().forEach(System.out::println);

	}

}
