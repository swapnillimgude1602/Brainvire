package section25_collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties p = new Properties();
		p.setProperty("Brand", "Dell");
		p.setProperty("processor", "It");
		p.setProperty("OS", "Windows 10");
		p.setProperty("Model", "Ideapad");

		try {
			p.store(new FileOutputStream("/home/swapnil_limgude/iostreams/PropertiesDemo.txt"), "Laptop");
		} catch (IOException e) 
		{
			System.out.println(e);
		}
		
		System.out.println(p);
		System.out.println(p.getProperty("Brand"));	//get name 
		
		//read file
		try {
			p.load(new FileInputStream("/home/swapnil_limgude/iostreams/PropertiesDemo.txt"));
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
