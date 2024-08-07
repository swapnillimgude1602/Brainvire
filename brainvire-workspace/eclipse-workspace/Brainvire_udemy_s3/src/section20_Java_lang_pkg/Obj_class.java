package section20_Java_lang_pkg;

class Myobj
{
	public String toString()
	{
		return "To string meth";
	}
	
	public int hashCode()
	{
		return 100;
		
	}
	
	public boolean equals(Object o)
	{
		return this.hashCode()==o.hashCode();
				
	}
}

//class myobj2 extends Myobj
//{
//	
//}
public class Obj_class {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myobj o1 = new Myobj();
		Myobj o2 = new Myobj();

		System.out.println("to string"+o1);
		System.out.println(o1.equals(o1));
		System.out.println(o1.hashCode());
		//myobj2 m2 = new myobj2();
		
	}

}
