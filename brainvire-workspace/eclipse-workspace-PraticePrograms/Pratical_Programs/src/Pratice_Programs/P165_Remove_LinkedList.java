package Pratice_Programs;

import java.util.LinkedList;
import java.util.Scanner;

public class P165_Remove_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> list = new LinkedList<String>();
		list.add("swap");
		list.add("nil");
		list.add("lim");
		list.add("gude");
		System.out.println("Before delete: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + " :" + list.get(i));
		}
		System.out.println("Enter index to delete: ");
		int deleEle = sc.nextInt();
		list.remove(deleEle);
		System.out.println("After delete: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + " :" + list.get(i));
		}

	}

}
