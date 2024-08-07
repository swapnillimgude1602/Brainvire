package section27_Searching;

public class LinearSearch {
	
	public static int linearsearch(int arr[], int val) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==val)
			{
				System.out.println("Element Found at index: "+i);
				return i;
			}
		}
		System.out.println("The element"+val+" not found");
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,2,10,23,4};
		LinearSearch.linearsearch(arr, 10);
		

	}

}
