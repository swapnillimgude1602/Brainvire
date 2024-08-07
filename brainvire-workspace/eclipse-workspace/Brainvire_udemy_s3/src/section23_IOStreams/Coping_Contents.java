package section23_IOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
public class Coping_Contents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
      try {
                FileInputStream fin=new FileInputStream("/home/swapnil_limgude/iostreams/OutputStream3.txt");
                FileOutputStream fout=new FileOutputStream("/home/swapnil_limgude/iostreams/Output.txt");
                int a;
                while((a=fin.read())!=-1){
                    fout.write(a);
                }
      }catch( IOException e) {System.out.println(e);} 
	
		
		//Displaying copied file
        try{
            try(FileInputStream fin3=new FileInputStream("/home/swapnil_limgude/iostreams/Output.txt")){
                byte[] b=new byte[fin3.available()];
                fin3.read(b);
                String str=new String(b);
                System.out.print(str);
            }
        }catch(Exception e){}

	
		
	
	}

}
