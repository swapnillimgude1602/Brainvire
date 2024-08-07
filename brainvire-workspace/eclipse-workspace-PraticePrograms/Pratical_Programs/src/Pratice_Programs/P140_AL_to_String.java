package Pratice_Programs;

import java.util.ArrayList;

public class P140_AL_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Swapnil");
		list.add("Maruti");
		list.add("Limgude");

		// String convert
		String strArr[] = new String[list.size()];
		list.toArray(strArr);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		for (String printArray : strArr) {
			System.out.println("Array Elements: " + printArray);
		}

	}

}
