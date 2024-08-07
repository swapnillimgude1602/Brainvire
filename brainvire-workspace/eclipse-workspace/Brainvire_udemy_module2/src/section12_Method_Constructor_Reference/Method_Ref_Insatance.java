package section12_Method_Constructor_Reference;

public class Method_Ref_Insatance {

	public void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("-- Child Thread --"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Ref_Insatance t = new Method_Ref_Insatance ();
		
		//	   obj ref :: method name
		Runnable r = t :: m1; 	//For non static we have to make obj of class anf refer to method.
		Thread T = new Thread(r);
		T.start();
		
		for(int i = 0; i<=10;i++)
		{
			System.out.println("-- Main Thread --" +i);

		}
	}

}
