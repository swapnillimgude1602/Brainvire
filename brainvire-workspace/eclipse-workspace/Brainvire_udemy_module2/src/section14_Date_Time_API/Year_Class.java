package section14_Date_Time_API;

import java.time.Year;
import java.util.Scanner;

public class Year_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int yy = sc.nextInt();
		
		Year year = Year.of(yy);
		if(year.isLeap()) System.out.println("--Leap Year--");
		else System.out.println("--Not A Leap Year--");
		sc.close();
	}

}
