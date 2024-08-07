package section5_default_static;

interface demo
{
	default void m1()
	{
		System.out.println("Default method");
	}
}
public class Default_method1 implements demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_method1 d = new Default_method1();
		d.m1();
	}

}
