package section14_Date_Time_API;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneId_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId america = ZoneId.of("America/Los_Angeles");
		System.out.println(america);
		System.out.println(america.getId());
		System.out.println(america.getRules()); //used to get the time-zone rules offset

		//Zoned Date and Time
		
		ZonedDateTime dt = ZonedDateTime.now(america);
		System.out.println(dt);
		
		ZonedDateTime dt1 = ZonedDateTime.now(zone);
		System.out.println(dt1);


	}

}
