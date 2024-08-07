package section3_Arrays;

public class ArrayOperation_1dArray {
	int arr[] = null;
	
	//sets array value to minimun integer value
	public ArrayOperation_1dArray(int sizeofArray) {
		arr = new int[sizeofArray];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	public void insertArray(int loc , int value)
	{
		try {
			if(arr[loc] == Integer.MIN_VALUE) {
				arr[loc] = value;
				System.out.println("--successfully Inserted--");
			}
			else {
				System.out.println("--Already Occupied--");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
		
	}
	
	public void arrayTraversal()
	{
		//array Traversal
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public void searchElement(int searchValue)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==searchValue)
				System.out.println(arr[i]+" Element found at index"+i);
		}
		System.out.println(searchValue+"Element Not Found");

	}
	
	public void deleteElement(int valueDeleteIndex)
	{
		try {
			arr[valueDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("--Successfully Deleted--");

			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("--Index not in range--");
		}
		
		
	}
	
		
	
	public static void main(String args[])
	{
		ArrayOperation_1dArray array = new ArrayOperation_1dArray(4);
		array.insertArray(0, 10);
		array.insertArray(1, 20);
		array.insertArray(2, 30);
		array.insertArray(1, 40);
		array.insertArray(3, 50);

		
		//accessing element
	//	System.out.println(insert.arr[0]);
	//	System.out.println(insert.arr[3]);
		
		//traversing array
		array.arrayTraversal();
		
		//searching element
		array.searchElement(90);
		
		//Deleting Element
		array.deleteElement(1);
		System.out.println("After Deleting element :");
		array.arrayTraversal();

		
		
		
	}
	

}
