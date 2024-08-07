package Evalution;

public class smallest {
	public static void main(String args[]) {
		int arr[] = { 1, 3, 5, 4, 9 };
		int small = Integer.MAX_VALUE;
		// int small = arr[0];
		int secondSmall = Integer.MAX_VALUE;
		// int secondSmall =arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				secondSmall = small;
				small = arr[i];
			} else if (arr[i] < secondSmall) {
				secondSmall = arr[i];
			}
		}
		System.out.println("Smallest:" + small + " secondSmall: " + secondSmall);
	}

}
