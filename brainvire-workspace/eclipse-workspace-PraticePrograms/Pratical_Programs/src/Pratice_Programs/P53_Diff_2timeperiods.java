package Pratice_Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P53_Diff_2timeperiods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String timePeriod1 = "11:05:00";
		String timePeriod2 = "05:20:00";
		SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
		Date dat1 = timeformat.parse(timePeriod1);
		Date dat2 = timeformat.parse(timePeriod2);
		long diffInMs = dat2.getTime() - dat1.getTime();
		long diffInSec = diffInMs / 1000 % 60;
		long diffInMin = diffInMs / (60 * 1000) % 60;
		long diffInHr = diffInMs / (60 * 60 * 1000) % 24;
		System.out.format("Difference between these two time periods is: " + diffInHr + " hours " + diffInMin
				+ " minutes " + diffInSec + " seconds");

	}

}
