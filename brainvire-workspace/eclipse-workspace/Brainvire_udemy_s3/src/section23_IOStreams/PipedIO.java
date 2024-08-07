package section23_IOStreams;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.InputStream;

class producer extends Thread
{
	OutputStream os;	//ref outputstream
	
	public producer(OutputStream o)
	{
		os=o;
	}
	
	public void run()
	{
		int count=1;
		while(true)
		{
			try {
				os.write(count);
				os.flush();
				System.out.println("Producer"+count);
				//System.out.flush();
				Thread.sleep(1000);

				count++;
			}
			catch(IOException e) {System.out.println(e);}
			catch(InterruptedException e) {System.out.println(e);}
		}
	}
}

class consumer extends Thread
{
	InputStream is;	//ref Inputstream
	
	public consumer(InputStream s)
	{
		is=s;
	}
	
	public void run()
	{
		int x;
		while(true)
		{
			try {
				x=is.read();
				System.out.println("Consumer"+x);
				System.out.flush();
				Thread.sleep(1000);
			}
			catch(IOException e) {System.out.println(e);}
			catch(InterruptedException e) {System.out.println(e);}

		}
	}
}
public class PipedIO {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pos.connect(pis);	//connects pis and pos
		
		producer p = new producer(pos);
		consumer c = new consumer(pis);
		
		p.start();
		c.start();
		
		

	}

}
