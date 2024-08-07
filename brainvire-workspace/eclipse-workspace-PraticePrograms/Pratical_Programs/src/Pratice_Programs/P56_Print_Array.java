package Pratice_Programs;

import java.util.Scanner;

public class P56_Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size for an array: ");
		int arrSize = sc.nextInt();
		int arr[] = new int[arrSize];
		// To accept
		System.out.println("Enter Elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// to Display
		System.out.println("Entered Elements in array: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
