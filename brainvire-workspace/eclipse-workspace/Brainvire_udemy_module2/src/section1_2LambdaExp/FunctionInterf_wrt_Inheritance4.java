package section1_2LambdaExp;

@FunctionalInterface
interface inter4
{
	public void m1();
}

interface c4 extends inter4
{
	public void m1();
	public void m2();

}

/* child interface in not annotated with  functional interface so it will not give error
 * we can make multiple abstract methods
 */

public class FunctionInterf_wrt_Inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 c1 = ()->System.out.println("case 2");
		c1.m1();

	}

}
