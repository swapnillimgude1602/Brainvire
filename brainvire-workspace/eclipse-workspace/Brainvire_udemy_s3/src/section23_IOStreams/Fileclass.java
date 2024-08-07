package section23_IOStreams;

import java.io.File;
public class Fileclass {
	public static void main(String args[])
	{
		File f = new File("/home/swapnil_limgude/iostreams");
		
		System.out.println(f.isDirectory());	//checks for directory
		
		File list[] =f.listFiles(); 
		
		for(File x : list)
		{
			System.out.println(x.getParent()+""+x.getPath());		//gets parent file name and path filename
		}
		
//		String ar[]=f.list();
//		for(String x: ar)
//		{
//			System.out.println(x);
//		}
	}

}