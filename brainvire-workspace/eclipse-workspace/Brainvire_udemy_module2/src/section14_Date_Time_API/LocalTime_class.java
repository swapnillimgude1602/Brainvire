package section14_Date_Time_API;

import java.time.LocalTime;

public class LocalTime_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int hr = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nanosec = time.getNano();
		
		System.out.println(hr+":"+min+":"+sec+":"+nanosec);

	}

}
