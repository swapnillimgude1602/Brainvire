package Pratice_Programs;

public class P99_BinarySearch {

	public static int binarySearch(int arr[], int searchElement) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;

		while (arr[mid] != searchElement) {
			if (searchElement < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if (arr[mid] == searchElement) {
			System.out.println("Element found at index: " + mid);
			return mid;
		}
		System.out.println("element" + searchElement + " ot found");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 14, 67, 2, 1, 19, 5 };
		binarySearch(arr, 23);

	}

}
