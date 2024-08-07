package Pratice_Programs;

import java.util.Scanner;

public class P47_MultiplyMatrix_Function {

	public static int[][] multiply(int matrix1[][], int matrix2[][], int r1, int c1, int c2) {
		int mul[][] = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				for (int k = 0; k < c2; k++) {
					mul[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter row and column for 1st Matrix: ");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter row and column for 2st Matrix: ");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();

		int matrix1[][] = new int[r1][c1];
		int matrix2[][] = new int[r2][c2];

		System.out.println("Enter Elements 1st in array: ");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++)
				matrix1[i][j] = sc.nextInt();
		}
		System.out.println("Enter Elements 2nd in array: ");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++)
				matrix2[i][j] = sc.nextInt();
		}
		
		int prod[][] = multiply(matrix1, matrix2, r1, c1, c2);
		
		for(int[] row: prod) {
			for(int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
