package Pratice_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class P51_Lexicographical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of element: ");
		int size = sc.nextInt();
		String arr[] = new String[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr);

		for (String eleDisp : arr) {
			System.out.println(eleDisp);
		}
	}

}
