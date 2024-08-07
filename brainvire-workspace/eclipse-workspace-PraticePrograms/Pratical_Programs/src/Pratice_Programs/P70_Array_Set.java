package Pratice_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P70_Array_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array to set
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Strings: ");
		String arr[] = new String[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		Set<String> setList = new HashSet<String>(Arrays.stream(arr).collect(Collectors.toSet()));
		for (String s : setList) {
			System.out.println("setList: " + s);
		}

		// set to array

		String arr1[] = new String[setList.size()];
		setList.toArray(arr1);
		for (String s : arr1) {
			System.out.println("ArrayList: " + s);
		}
	}

}
