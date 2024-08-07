package Pratice_Programs;

import java.util.Arrays;
import java.util.EnumSet;

public class P133_Iterate_enum {
	enum color {
		GREEN, BLUE, RED, BLACK, WHITE
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (color c : color.values()) {
			System.out.println("iterating over enums:" + c);
		}
		//java8
		Arrays.asList(color.values()).forEach(col -> System.out.println(col));
	}

}
