package Pratice_Programs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P63_Curr_Date_Time {

	public static void main(String[] args) {
		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Define a formatter to format the date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		// Format and print the current date and time
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("Current Date and Time: " + formattedDateTime);
	}

}
