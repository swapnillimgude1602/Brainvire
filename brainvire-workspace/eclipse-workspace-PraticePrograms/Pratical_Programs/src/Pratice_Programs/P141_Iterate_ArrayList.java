package Pratice_Programs;

import java.util.ArrayList;

public class P141_Iterate_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("swap");
		list.add("nil");
		list.add("lim");
		list.add("gude");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element: "+list.get(i));
		}

		for (String list2 : list) {
			System.out.print(list2);
		}
	}

}
