package section23_IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class serialization_input_read {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/home/swapnil_limgude/iostreams/Serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Stud s= (Stud)ois.readObject();
		System.out.println(s);	
		fis.close(); 
		ois.close();

	}

}
