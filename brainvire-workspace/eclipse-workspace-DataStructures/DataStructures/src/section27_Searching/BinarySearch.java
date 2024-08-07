package section27_Searching;

public class BinarySearch {
	
	public static int binarysearc(int arr[], int val)
	{
		int start=0;
		int end=arr.length-1;
		int middle=(start+end)/2;
		
		while(arr[middle]!=val) {
			if(val<arr[middle])
			{
				end=middle-1;
			}
			else {
				start=middle+1;
			}
			middle=(start+end)/2;
		}
		if(arr[middle] == val)
		{
			System.out.println("Element found at index: "+middle);
			return middle;
		}
		System.out.println("element"+val+" ot found");
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,2,10,23,4};
		BinarySearch.binarysearc(arr, 10);
		

	}

}
