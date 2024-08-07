package Pratice_Programs;

import java.util.HashMap;

public class P49_Repeat_char_count {

	// TODO Auto-generated method stub
	static HashMap<Character, Integer> repeatCharCount(char arr[]) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'a', 'b' };
		HashMap<Character, Integer> hm = repeatCharCount(arr);
		System.out.println(hm);
	}
}