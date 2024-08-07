package Evalution;

import java.util.HashMap;

public class repeat_char_count {
	 static HashMap<Character, Integer> characterCount(char arr[]){
		HashMap<Character, Integer> hm=new HashMap<>();
		for(char ch:arr) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else
				hm.put(ch,1);
			
			}
		return hm;
	}
	public static void main(String[] args) {
		char arr[]= {'h','e','l','l','o'};
		HashMap<Character, Integer> hm=characterCount(arr);
		System.out.println(hm);
	}

}