package Pratice_Programs;

import java.util.LinkedList;

public class P139_LL_to_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(17);

		// Array convert
		Integer arr[] = new Integer[list.size()];
		list.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (Integer printArray : arr) {
			System.out.println("Array Elements: " + printArray);
		}

	}

}
