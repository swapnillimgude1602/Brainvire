package Pratice_Programs;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class P146_RemoveDupl_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(3);
		list.add(4);
		System.out.println(list);
		ArrayList<Integer> newlist = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
		System.out.println(newlist);
	}

}
