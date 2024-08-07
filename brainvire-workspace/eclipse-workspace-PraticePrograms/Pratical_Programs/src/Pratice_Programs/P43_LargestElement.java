package Pratice_Programs;

import java.util.Scanner;

public class P43_LargestElement {

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

		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Largest Value: "+largest);
	}

}
