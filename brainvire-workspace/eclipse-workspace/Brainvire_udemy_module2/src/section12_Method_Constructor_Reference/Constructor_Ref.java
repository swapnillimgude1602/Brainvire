package section12_Method_Constructor_Reference;
class Test
{
	Test()
	{
		System.out.println("--Test Class And Obj Creation--");
	}
}
interface constr
{
	public Test get();
}
public class Constructor_Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constr c = Test :: new;	//Constructor reffering to method
		Test t = c.get(); //calling method

	}

}
