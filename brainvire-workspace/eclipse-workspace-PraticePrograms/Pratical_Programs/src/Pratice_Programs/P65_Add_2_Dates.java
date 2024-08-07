package Pratice_Programs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P65_Add_2_Dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first date (YYYY-MM-DD): ");
		String dateString1 = sc.next();
		LocalDate date1 = LocalDate.parse(dateString1, DateTimeFormatter.ISO_DATE);

		System.out.print("Enter the second date (YYYY-MM-DD): ");
		String dateString2 = sc.next();
		LocalDate date2 = LocalDate.parse(dateString2, DateTimeFormatter.ISO_DATE);

		// Add dates
		LocalDate resultDate = date1.plusDays(date2.getDayOfMonth()).plusMonths(date2.getMonthValue())
				.plusYears(date2.getYear());
		System.out.println("Result: " + resultDate.format(DateTimeFormatter.ISO_DATE));

	}

}
