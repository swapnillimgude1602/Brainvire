package section14_Date_Time_API;

import java.time.LocalDate;

public class LocalDate_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);	//current date
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		System.out.println(dd+":"+mm+":"+yy);
		System.out.printf("%d - %d - %d", dd,mm,yy);

	}

}
