package section1_2LambdaExp;

@FunctionalInterface
interface inter
{
	public void m1();
}

@FunctionalInterface
interface c extends inter
{
	
}

/* if an interface extends functional interface and child does not contain any abstract method then 
 * child interface is always functional interface
*/
public class FunctionInterf_wrt_Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c c1 = ()->System.out.println("hello");
		c1.m1();

	}

}
