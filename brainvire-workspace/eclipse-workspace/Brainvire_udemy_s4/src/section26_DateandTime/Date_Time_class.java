package section26_DateandTime;

import java.time.Duration;
import java.time.Instant;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class Date_Time_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime zdt = ZonedDateTime.now();// print current time
		System.out.println(zdt);
		MonthDay md = MonthDay.now();
		System.out.println(md);
		YearMonth ym = YearMonth.now();
		System.out.println(ym);
		Year y = Year.now();
		System.out.println(y);
		Period p = Period.ofDays(20);
		System.out.println(p);// P20D
		Duration d = Duration.between(zdt, zdt);
		System.out.println(d);// PT0S
		Instant s = Instant.now();
		System.out.println(s); // current time

	}

}
