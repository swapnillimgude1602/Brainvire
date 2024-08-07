package section1_2LambdaExp;

interface addition
{
	public void add(int x, int y);
}
public class LambdaEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition a= (x,y) -> { System.out.println("addition : "+(x+y));};
		a.add(12, 30);
		a.add(100, 330);
	}

}
