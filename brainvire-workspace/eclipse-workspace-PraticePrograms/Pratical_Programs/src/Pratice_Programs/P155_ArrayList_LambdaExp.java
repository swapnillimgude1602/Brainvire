package Pratice_Programs;

import java.util.ArrayList;

public class P155_ArrayList_LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().forEach(i -> {
			System.out.println(i);
		});
	}

}
	