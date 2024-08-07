package section23_IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Stud implements Serializable{
	int roll_no;
	String name;
	String dept;
	static int x=10;
	transient int t;
	
	public Stud()
	{
		
	}

	public Stud(int roll_no, String name, String dept) {
		
		this.roll_no = roll_no;
		this.name = name;
		this.dept = dept;
		t = 30;
		x=30; 
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", dept=" + dept + ", t=" + t + ", x="+ x +"]";
	}
	
	
	
}
public class serialization_outstream_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos = new FileOutputStream("/home/swapnil_limgude/iostreams/Serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Stud s = new Stud(10, "Swapnil", "It");
		oos.writeObject(s);
		
		oos.close();
		fos.close();
		
		}
		catch(FileNotFoundException e) {System.out.println(e);}
		catch(IOException e) {System.out.println(e);}
	}

}
