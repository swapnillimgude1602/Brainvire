package Pratice_Programs;

import java.util.ArrayList;

public class P144_MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(4);
		list1.add(3);
		list1.add(4);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.addAll(list1);
		for (Integer mergerlist : list2) {
			System.out.print(mergerlist);
		}
	}

}
