package section6_PredefinedFunction_Predicate;

//Boolean valued Function used for condition check
interface Predicate<T>
{
	boolean test (T t);
}
public class Predicate_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <Integer> p = I -> I>10;	//lambda checks greater no
		System.out.println(p.test(50));		//single abstract Function
		System.out.println(p.test(5));

	}

}
