package section21_Annotations_javaD;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

class Display
{
public void disp()
{
	System.out.println("hi");
}
}

class Anno extends Display
{
	@Override
	public void disp()
	{
		System.out.println("hello");
	}
	
	@Deprecated
	public void show()
	{
		System.out.println("good");
	}
}

public class Functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("Deprecated")
		Anno a = new Anno();
		a.show();
		a.disp();
		
		//using function interface
		int z = 5;
		 
        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;
 
        int ans = s.calculate(z);	  // parameter passed and return type must be

        System.out.println(ans);

	}

}
