package section24_Generics;

@SuppressWarnings("unchecked")
class MyArrayString<T>
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


public class Generics_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArrayString<String> ma = new MyArrayString<>();
		ma.append("abc");
		ma.append("Def");
		ma.append("xyz");
		ma.display();

	}

}

