package section23_IOStreams;

import java.io.ByteArrayInputStream;
public class Bytearrayinputstream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		byte b[]={'a','b','c','d','e','f','g','h','i','j'};
        
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());	//read all bytes 
        System.out.println(str);
                bis.close();
			
			

	}

}	
