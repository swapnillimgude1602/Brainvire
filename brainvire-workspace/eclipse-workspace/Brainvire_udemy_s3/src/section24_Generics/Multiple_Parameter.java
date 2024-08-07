package section24_Generics;

@SuppressWarnings("unchecked")
class MyArrayMultipara<T ,k>
{
	T A[] = (T[]) new Object [10]; //Convert object to genric
	int length = 0;
	 public void append(T v, String k)
	 {
		 A[length++]=v;
	 }
	 
	 public void display()
	 {
		 for(int i=0;i<length;i++)
		 {
			 System.out.println(A[i]);
		 }
	 }
}

public class Multiple_Parameter  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayMultipara<Integer, String> ma = new MyArrayMultipara<>();		//multiple parameters
		ma.append(10,"Swap");
		ma.append(10,"Swap");
	}

}
