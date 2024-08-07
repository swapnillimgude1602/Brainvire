package section5_default_static;

interface stat1
{
	public static void m1()
	{
		System.out.println("static method");
	}
}
public class Stat_meth_overide implements stat1{
	
	public static void m1()
	{
		System.out.println("static method override");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat1.m1();
		Stat_meth_overide.m1();
		

	}

}
