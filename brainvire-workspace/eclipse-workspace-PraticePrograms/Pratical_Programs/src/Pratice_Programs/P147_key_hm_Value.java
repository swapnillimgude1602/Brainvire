package Pratice_Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class P147_key_hm_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Swapnil", 1);
		hm.put("Maruti", 2);
		hm.put("Limgude", 3);

		System.out.println("Enter the key: ");
		Integer value = sc.nextInt();

		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == value) {
				System.out.println("The key for value " + value + " is " + entry.getKey());
				return;
			}
			else {
				System.out.println("Key doesnt match");
				return;
			}
		}
	}

}
