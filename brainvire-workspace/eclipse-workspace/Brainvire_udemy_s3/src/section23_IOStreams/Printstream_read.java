package section23_IOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printstream_read {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/Printstream.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));	
		//upon input stream we cannot assign reader class so it connect reader class with stream class
		Student s = new Student();
		s.roll_no=Integer.parseInt(br.readLine());
		s.name=br.readLine();
		s.dept=br.readLine();
		
		System.out.println("Roll_no "+s.roll_no+" Name "+s.name+" Dept "+s.dept);
	}

}
