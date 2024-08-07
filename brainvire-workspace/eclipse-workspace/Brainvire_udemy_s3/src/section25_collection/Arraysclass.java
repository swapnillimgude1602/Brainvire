package section25_collection;

import java.util.Arrays;

public class Arraysclass {

	public static void main(String[] args) {
		
		int a[] = {2,4,6,8,1,3,5};
		int b[] = {2,4,6,8,1,3,5,7};
		
		System.out.println(Arrays.compare(a, b)); //results in 0,1,-1
		
		System.out.println(Arrays.binarySearch(a, 4));	//returns index
		
		System.out.println(Arrays.mismatch(a, b));
		
		Arrays.fill(b, 0);		//fills all element with 0
		for(int y: b)
		{
			System.out.print(y);
		}
		System.out.println();
		Arrays.sort(a);
		for(int x:a)
		{
			System.out.print(x);
		}

		
		

		
	}

}
