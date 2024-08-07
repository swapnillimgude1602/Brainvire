package section24_Generics;

@SuppressWarnings("unchecked")
class MyArray<T>
{
	T A[] = (T[]) new Object [10]; //Convert object to genric
	int length = 0;
	 public void append(T v)
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

public class Generics_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray<Integer> ma = new MyArray<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();

	}

}
