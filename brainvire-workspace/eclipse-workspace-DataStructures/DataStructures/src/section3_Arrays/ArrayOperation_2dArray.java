package section3_Arrays;

import java.util.Arrays;

public class ArrayOperation_2dArray {
	
	int arr[][] = null;
	
	public ArrayOperation_2dArray(int no_rows, int no_col)
	{
		this.arr = new int[no_rows][no_col];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertArray(int row, int col, int value)
	{
		try {
			if(arr[row][col]==Integer.MIN_VALUE)
			{
				arr[row][col]=value;
				System.out.println("--Inserted Successfully--");
			}
			else
			{
				System.out.println("--already Occupied--");
			}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("--Invalid Index--");
		}
	}

	public void accessingValues(int row, int col)
	{
		try {
			System.out.println("Cell Value is"+arr[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("--Invalid Index--");
		}
		
	}
	
	public void arrayTraversal()
	{
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				System.out.print( arr[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public void searchElement(int value)
	{
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[0].length;col++) {
				if(arr[row][col]==value) {
					System.out.println("value found at row:"+row+"col: "+col);
					return;
				}
				
			}
		}
		System.out.println("--Value not found--");
	}
	
	public void deleteElement(int row, int col)
	{
		try {
			arr[row][col] = Integer.MIN_VALUE;
			System.out.println("Successfully deleted "+arr[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("--Invalid Index--");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperation_2dArray array = new ArrayOperation_2dArray(3,3);
		//inserting
		array.insertArray(0, 0, 10);
		array.insertArray(0, 1, 20);
		array.insertArray(0, 2, 30);
		array.insertArray(1, 0, 40);
		array.insertArray(2, 0, 50);

		System.out.println(Arrays.deepToString(array.arr));
		
		//accessing
		array.accessingValues(0, 2);
		
		//traversal
		array.arrayTraversal();
		
		//searching
		array.searchElement(60);
		
		//deleting
		array.deleteElement(2, 0);
		System.out.println("After delete-");
		array.arrayTraversal();
		

		

	}

}
