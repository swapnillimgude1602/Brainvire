package section14_Date_Time_API;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Period_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate bd=LocalDate.of(2000, Month.FEBRUARY, 16);
        LocalDate today=LocalDate.now();
        
        Period p1=Period.between(bd, today);
        
        System.out.println(p1);
        System.out.println(p1.getDays());
        System.out.println(p1.getMonths());
        System.out.println(p1.getYears());
        System.out.println(p1.toTotalMonths());
	}

}
