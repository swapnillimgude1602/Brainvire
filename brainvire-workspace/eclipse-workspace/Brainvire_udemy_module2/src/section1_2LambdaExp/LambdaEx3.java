package section1_2LambdaExp;

interface area
{
	public int square (int x);
}
public class LambdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area a = (x) -> {return x*x;}
		//area a = (x) -> return x*x;
		//more simplify
		area a = x-> x*x;
		System.out.println(a.square(20));
		System.out.println(a.square(5));

	}

}
