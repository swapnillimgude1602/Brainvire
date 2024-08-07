package Pratice_Programs;

import java.util.*;

public class P64_Convert_milis_min_sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter milliseconds: ");
		long milliseconds = scanner.nextLong();

		// Convert milliseconds to minutes and seconds
		long minutes = milliseconds / (1000 * 60);
		long seconds = (milliseconds % (1000 * 60)) / 1000;

		System.out.println("Converted to: " + minutes + " minutes and " + seconds + " seconds");
	}
}
