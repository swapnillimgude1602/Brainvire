package section1_2LambdaExp;

@FunctionalInterface
interface inter2
{
	public void m1();
}

@FunctionalInterface
interface c2 extends inter2
{
	public void m1();
}

/* In child interface we can define excatly same abstract methods present in parent interface 
 * 
 */

public class FunctionInterf_wrt_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 c1 = ()->System.out.println("case 2");
		c1.m1();



	}

}
