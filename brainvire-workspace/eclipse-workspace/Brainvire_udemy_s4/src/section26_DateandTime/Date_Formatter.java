package section26_DateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Date_Formatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime d=LocalDateTime.now();
	        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        System.out.println(df.format(d));
	        DateTimeFormatter df1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        System.out.println(df1.format(d));
	        DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd/yyyy/yyyy HH:mm:ss");
	        System.out.println(df2.format(d));
	        DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd/yyyy/mm HH:mm:ss");
	        System.out.println(df3.format(d));
	        System.out.println(d.get(ChronoField.YEAR));
	        System.out.println(d.get(ChronoField.MINUTE_OF_HOUR));//
	        System.out.println(d.get(ChronoField.DAY_OF_YEAR)); // 209
	        System.out.println(d.get(ChronoField.YEAR_OF_ERA));// 2023

	}

}
