package Evalution;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charCount {
	    public static void main(String[] args) {
	        String inputString = "Hello, World!";

	        // Count occurrences using Java Streams
	        Map<Character, Long> characterCountMap = inputString.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        // Display the result
	        System.out.println("Occurrences of each character in the given string:");
	        characterCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
	    }
	}
