package Pratice_Programs;

import java.util.ArrayList;

class Display {
	public void displayArrayList(ArrayList<Integer> showNumber) {
		showNumber.stream().forEach(s -> System.out.println("ArrayList display: " + s));
	}
}

public class P154_ArrayList_FunArgument {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		Display d = new Display();
		d.displayArrayList(list);
	}

}
