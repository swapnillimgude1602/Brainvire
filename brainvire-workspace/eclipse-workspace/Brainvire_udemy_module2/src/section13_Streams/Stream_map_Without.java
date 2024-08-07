package section13_Streams;

import java.util.ArrayList;

public class Stream_map_Without {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(55);
		list.add(30);
		list.add(15);
		list.add(5);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i : list)
		{
			al.add(i*i);
		}
		System.out.println(al);

	}

}
