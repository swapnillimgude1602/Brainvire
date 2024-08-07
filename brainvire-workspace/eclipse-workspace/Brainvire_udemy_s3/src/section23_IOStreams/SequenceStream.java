package section23_IOStreams;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*; 

public class SequenceStream {

	public static void main(String[] args) throws Exception{
		    
		   FileInputStream fin1=new FileInputStream("/home/swapnil_limgude/iostreams/Source1.txt");    
		   FileInputStream fin2=new FileInputStream("/home/swapnil_limgude/iostreams/Source2.txt");    
		   FileOutputStream fout=new FileOutputStream("/home/swapnil_limgude/iostreams/Destination.txt");      
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
		   int i;    
		   while((i=sis.read())!=-1)    
		   {    
		     fout.write(i);        
		   }    
		   sis.close();    
		   fout.close();      
		   fin1.close();      
		   fin2.close();       
		   System.out.println("completed");  
		  }    
	 
	}


