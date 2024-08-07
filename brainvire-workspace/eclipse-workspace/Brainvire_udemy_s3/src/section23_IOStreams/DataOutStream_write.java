package section23_IOStreams;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutStream_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/DataStream.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			//stores data into its own datatype. they can only read by datainputstream
			
			Student s = new Student();
			s.roll_no=10;
			s.name="abc";
			s.dept="mech";
			
			dos.writeInt(s.roll_no);
			dos.writeUTF(s.name);//unicode transformation format (stores entire string)
			dos.writeUTF(s.dept);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {System.out.println(e);}
		
	}

}
