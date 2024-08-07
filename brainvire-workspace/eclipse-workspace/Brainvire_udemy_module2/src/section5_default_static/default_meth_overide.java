package section5_default_static;

interface demo1
{
	default void m1()
	{
		System.out.println("Default method");
	}
}
public class default_meth_overide implements demo1 {

	@Override
	public void m1()
	{
		System.out.println("Default method overide own implementation");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		default_meth_overide d = new default_meth_overide();
		d.m1();

	}

}
