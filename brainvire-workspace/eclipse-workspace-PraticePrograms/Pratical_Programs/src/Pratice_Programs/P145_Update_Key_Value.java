package Pratice_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class P145_Update_Key_Value {

	private static void updateValue(HashMap<String, Integer> map, String key, int newValue) {
		if (map.containsKey(key)) {
			map.put(key, newValue);
			System.out.println("value Updated");
		} else {
			System.out.println("key Not Found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> stud = new HashMap<>();

		stud.put("swap", 22);
		stud.put("madh", 23);
		stud.put("Dev", 24);

		System.out.println("Before : " + stud);
		System.out.println("Enter the key & value to update: ");
		String upKey = sc.next();
		int upVal = sc.nextInt();

		updateValue(stud, upKey, upVal);
		System.out.println("After : " + stud);
	}

}
