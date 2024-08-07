package Pratice_Programs;

import java.util.Scanner;

public class P48_TransposeMatrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		System.out.print("Enter the number of columns: ");
		int columns = scanner.nextInt();

		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the matrix elements:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int[][] transposeMatrix = new int[columns][rows];

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				transposeMatrix[i][j] = matrix[j][i];
			}
		}

		System.out.println("\nOriginal Matrix:");
		printMatrix(matrix);

		System.out.println("\nTranspose Matrix:");
		printMatrix(transposeMatrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
