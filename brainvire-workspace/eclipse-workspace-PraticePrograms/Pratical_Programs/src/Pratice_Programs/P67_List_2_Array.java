package Pratice_Programs;

import java.util.LinkedList;
import java.util.List;

public class P67_List_2_Array {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("Practice");
		int n = list.size();
		String[] arr = list.stream().toArray(String[]::new);
		for (String x : arr)
			System.out.print(x + " ");
	}

}
