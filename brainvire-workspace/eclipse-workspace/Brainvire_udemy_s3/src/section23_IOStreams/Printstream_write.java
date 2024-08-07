package section23_IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	int roll_no;
	String name;
	String dept;
}

public class Printstream_write {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/Printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		Student s= new Student();
		s.roll_no=1;
		s.name="Swap";
		s.dept="it";
		
		ps.println(s.roll_no);
		ps.println(s.name);
		ps.println(s.dept);

		ps.close();
		fos.close();
		}
		catch(FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
	}

}
