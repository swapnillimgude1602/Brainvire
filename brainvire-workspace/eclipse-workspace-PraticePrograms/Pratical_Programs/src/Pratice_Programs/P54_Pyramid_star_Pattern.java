package Pratice_Programs;

import java.util.Scanner;

public class P54_Pyramid_star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the triangle: ");
		int numberOfRows = sc.nextInt();

		drawTriangleStarPattern(numberOfRows);
	}

	private static void drawTriangleStarPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Print spaces before the stars
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}