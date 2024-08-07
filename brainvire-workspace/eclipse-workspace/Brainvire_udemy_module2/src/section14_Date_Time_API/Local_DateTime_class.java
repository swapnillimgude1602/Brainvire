package section14_Date_Time_API;

import java.time.LocalDateTime;

public class Local_DateTime_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yy = dt.getYear();

		int hr = dt.getHour();
		int min = dt.getMinute();
		int sec = dt.getSecond();
		int nanosec = dt.getNano();

		System.out.println(hr + ":" + min + ":" + sec + ":" + nanosec);
		System.out.printf("%d-%d-%d", dd, mm, yy);
		System.out.println("\nTime- "+hr + ":" + min + ":" + sec +""+" Date- "+dd+":"+mm+":"+yy);

	}

}
