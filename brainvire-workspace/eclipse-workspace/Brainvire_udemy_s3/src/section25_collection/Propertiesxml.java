package section25_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesxml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		p.setProperty("Brand", "BMW");
		p.setProperty("Engine", "8Stroke");
		p.setProperty("Drive", "$ wheel Drive");
		p.setProperty("Model", "iim");

		try {
			p.storeToXML(new FileOutputStream("/home/swapnil_limgude/iostreams/PropertiesDemo.xml"), "Car");
		} catch (IOException e) 
		{
			System.out.println(e);
		}
		
		//read file
		try {
			p.loadFromXML(new FileInputStream("/home/swapnil_limgude/iostreams/PropertiesDemo.xml"));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
