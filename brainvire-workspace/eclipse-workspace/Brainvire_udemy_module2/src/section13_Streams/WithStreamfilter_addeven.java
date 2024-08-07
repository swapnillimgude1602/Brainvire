package section13_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamfilter_addeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		List<Integer> l1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l1);

	}

}
