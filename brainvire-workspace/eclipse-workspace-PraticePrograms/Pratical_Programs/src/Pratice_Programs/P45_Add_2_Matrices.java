package Pratice_Programs;

import java.util.Scanner;

public class P45_Add_2_Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row for an array: ");
		int row = sc.nextInt();
		System.out.println("Enter column for an array: ");
		int col = sc.nextInt();
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int arr3[][] = new int[row][col];
		// To accept 1 st array
		System.out.println("Enter Elements 1st in array: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++)
				arr1[i][j] = sc.nextInt();
		}
		System.out.println("Enter Elements 2nd in array: ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++)
				arr2[i][j] = sc.nextInt();
		}
		System.out.println("Adding matrices: ");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++)
				arr3[i][j] = arr1[i][j] + arr2[i][j];
		}
		System.out.println("Displayy: ");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
