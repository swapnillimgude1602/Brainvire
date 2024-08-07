package section12_Method_Constructor_Reference;

interface stat
{
	public void m1();
}
public class Method_Ref_Static {

	public static void m2()
	{
		System.out.println("--Method Static Implementation--");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Used to refer Functional Interface
		 * alternate of lambda exp
		 * arg type must be same of both method
		 */
		
		   			//	class name :: method name

		stat s = Method_Ref_Static :: m2;
		s.m1();

	}

}
