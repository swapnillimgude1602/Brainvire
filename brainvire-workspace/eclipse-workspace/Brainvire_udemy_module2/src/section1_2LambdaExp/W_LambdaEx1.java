package section1_2LambdaExp;

interface addition1
{
	public void add(int x, int y);
}

class demo implements addition1
{

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Addititon : "+(x+y));
	}
	
}
public class W_LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition1 a1 = new demo();
		a1.add(13, 30);
		a1.add(23, 30);

	}

}
