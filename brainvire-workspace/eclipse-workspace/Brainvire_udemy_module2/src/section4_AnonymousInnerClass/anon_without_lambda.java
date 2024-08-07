package section4_AnonymousInnerClass;

public class anon_without_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						for(int i = 0; i<10;i++)
						{
							System.out.println("Child thread" + i);
						}
						
					}
			
				};
				
		Thread T = new Thread(r);
		T.start();
		for(int i = 0; i<10;i++)
		{
			System.out.println("Main thread" + i);
		}

	}

}
