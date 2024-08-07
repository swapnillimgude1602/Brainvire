package section13_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		List<Integer> al = list.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(al);

	}

}
