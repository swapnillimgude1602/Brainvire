package Pratice_Programs;

import java.util.LinkedList;

public class P167_Access_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("swap");
		list.add("nil");
		list.add("lim");
		list.add("gude");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index" + i + list.get(i));
		}
	}

}
