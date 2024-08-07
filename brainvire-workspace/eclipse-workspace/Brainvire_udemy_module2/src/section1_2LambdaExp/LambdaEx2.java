package section1_2LambdaExp;

interface strlen
{
	public int strLen(String s);
}

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		strlen sl = s -> s.length();
		System.out.println("length "+sl.strLen("Swapnil"));
		System.out.println("length "+sl.strLen("Limgude"));
		

	}

}
