package Pratice_Programs;

import java.util.Arrays;

public class P59_ConcatenateArrays {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int arrayLen1 = array1.length;
		int arrayLen2 = array2.length;
		int[] result = new int[arrayLen1 + arrayLen2];

		System.arraycopy(array1, 0, result, 0, arrayLen1);
		System.arraycopy(array2, 0, result, arrayLen1, arrayLen2);

		System.out.println(Arrays.toString(result));
	}

}
