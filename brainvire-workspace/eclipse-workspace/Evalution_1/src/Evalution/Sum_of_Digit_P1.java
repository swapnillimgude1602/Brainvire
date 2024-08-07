package Evalution;

import java.util.HashMap;
import java.util.Map;

public class Sum_of_Digit_P1 {
	    public static void main(String[] args) {
	        String inputString = "Hello, World!";
	        Map<Character, Integer> characterCountMap = new HashMap<>();

	        // Count occurrences
	        for (char ch : inputString.toCharArray()) {
	            characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Display the result
	        System.out.println("Occurrences of each character in the given string:");
	        characterCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
	    }
	}