package Pratice_Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P57_Convert_string_date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String strDate = "31/12/1998";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		System.out.println(strDate + "\t" + date1);

	}

}
