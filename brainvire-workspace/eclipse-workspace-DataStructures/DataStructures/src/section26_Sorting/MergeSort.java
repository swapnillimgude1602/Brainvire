package section26_Sorting;

public class MergeSort {

	public static void conquer(int arr[], int start, int mid, int end) {
		int merged[] = new int[end - start + 1]; // new array to store op
		int index1 = start;
		int index2 = mid + 1;
		int x = 0;

		while (index1 <= mid && index2 <= end) {
			if (arr[index1] <= arr[index2]) { // if 1st arr contain small ele and 2nd contain large ele
				merged[x++] = arr[index1++];
			} else {
				merged[x++] = arr[index2++]; // if 2st arr index contain larger ele
			}
		}
		// if 2nd array contains remaining elements which are sorted
		while (index1 <= mid) {
			merged[x++] = arr[index1++];

		}

		while (index2 <= end) {
			merged[x++] = arr[index2++];	
		}
	
		//copying merged array elements into orignal array
		for(int i=0, j=start; i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
	}

	public static void divide(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = start + (end - start) / 2;
		divide(arr, start, mid);
		divide(arr,mid+1,end);
		conquer(arr, start, mid, end);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 44, 22, 10, 20 };
		int len = arr.length;

		divide(arr, 0, len-1);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

