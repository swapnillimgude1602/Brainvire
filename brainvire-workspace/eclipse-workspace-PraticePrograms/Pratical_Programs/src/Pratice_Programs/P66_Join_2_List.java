package Pratice_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P66_Join_2_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(6, 7, 8, 98);

		List<Integer> joinedList = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());

		System.out.println("Joined List: " + joinedList);
	}
}
