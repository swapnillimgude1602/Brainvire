package section1_2LambdaExp;
@FunctionalInterface
interface inter3
{
	public void m1();
}

//@FunctionalInterface
//interface c3 extends inter3
//{
//	public void m2();
//}

/* We cannot define new abstract methods in child interface otherwise it will give an error.
 *  unexpected functional interface anno
 * multiple non-overriding abstract methods
 */

public class FunctionInterf_wrt_Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 c1 = ()->System.out.println("case 2");
		c1.m1();


	}
}
