package section14_Date_Time_API;

import java.time.LocalDateTime;
import java.time.Month;

public class Customized_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt = LocalDateTime.of(2000,Month.FEBRUARY,16,05,20,00);
		System.out.println(dt);
		
		System.out.println("After 6 months: "+dt.plusMonths(6));
		System.out.println("Before 6 months: "+dt.minusMonths(6));
		//System.out.println(dt.isAfter(dt));

	}

}
