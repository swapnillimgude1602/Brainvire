package section25_collection;

import java.util.*;

public class Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(0, 5);
		ll.addFirst(50);
		ll.addLast(100);

		ll.descendingIterator(); // return in decending order
		System.out.println("First: " + ll.getFirst()); // get obj at first index

		System.out.println("First: " + ll.getLast());	

		System.out.println("peek" + ll.peek());	//	returns 1st element / null
		System.out.println("ele "+ll.element());//	return 1st ele / no such ele exceptn

		System.out.println("poll" + ll.poll()); //  removes 1st ele /null
		ll.remove();	//	removes 1st ele / no such ele excption

		LinkedList<Integer> clone = new LinkedList<>();
		clone = (LinkedList<Integer>) ll.clone();

		// System.out.println(al1);

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		for (int i = 0; i < clone.size(); i++) {
			System.out.println(ll.get(i));
		}

	}

}
