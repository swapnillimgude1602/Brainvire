package section23_IOStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Dataoutstream_read {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/DataStream.txt");
		DataInputStream dis =new DataInputStream(fis);
		Student s = new Student();
		s.roll_no = dis.readInt();
		s.name = dis.readUTF();
		s.dept = dis.readUTF();
		
		System.out.println("Roll_no "+s.roll_no+" Name "+s.name+" Dept "+s.dept);

	}

}
