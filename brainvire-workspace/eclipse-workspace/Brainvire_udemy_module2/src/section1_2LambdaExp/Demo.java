package section1_2LambdaExp;

interface demo1
{
	public void m1();
	default void m2()
	{
		System.out.println("hello its default");
	}
	
	public static void m3()
	{
		System.out.println("hello its static");
	}
}

class test implements demo1
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello  its abstract class");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d = new test();
		d.m2();
		d.m1();
		demo1.m3();

	}

}
