package Pratice_Programs;

import java.time.LocalDate;
import java.util.Scanner;

public class P134_Birthday_Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date[1-31], Month[1-12], year");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		LocalDate curr = LocalDate.now(); 
		int currDate = curr.getDayOfMonth();
		int currMonth = curr.getMonthValue();
		int currYear = curr.getYear();
		
		if(currDate==date && currMonth==month) {
			System.out.println("Happy Birthday...!!!");
		}
		else {
			System.out.println("Sorry! not your birthday");
		}
	}

}
