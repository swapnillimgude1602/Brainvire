package section1_2LambdaExp;

class ThreadDemo implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//Child Thread
		for(int i = 0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	
	}
	
}
public class Thread_Without_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo r = new ThreadDemo();
		Thread T = new Thread(r);
		T.start();
		
		//Main Thread
		for(int i = 0; i<10; i++)
		{
			System.out.println("Main Thread");
		}

	}

}
