package Pratice_Programs;

public class P97_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 9, 1, 10, 5 };
		System.out.println("Unsorted Array: ");
		for (int unsorted : arr) {
			System.out.print(unsorted + " ");
		}
		System.out.println();
		System.out.println("Sorted Array: ");
		quickSort(arr, 0, arr.length - 1);
		for (int sorted : arr) {
			System.out.print(sorted + " ");
		}

	}

	public static void quickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if (low < high) {

			int part = partion(arr, low, high);
			quickSort(arr, low, part - 1);
			quickSort(arr, part + 1, high);
		}
	}

	private static int partion(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

}
