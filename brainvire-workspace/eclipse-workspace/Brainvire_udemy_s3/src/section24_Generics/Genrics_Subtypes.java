package section24_Generics;

@SuppressWarnings("unchecked")
class MyArray1<T>
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

//class MyArray2 extends MyArray1<String>	
//{
//	
//}

class MyArray2<T> extends MyArray1<T>	//class generic	super genric so sub also genric
{
	
}



public class Genrics_Subtypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray1<Integer> ma1 = new MyArray1<>();
		MyArray2<String> ma2 = new MyArray2<>();	//if we dont mention anything it becomes object <String>
		
		ma2.append("abcd");
		ma2.append("xyz");
		
		ma1.append(10);
		ma1.append(20);
		ma1.append(30);
		
		ma1.display();
		ma2.display();
	}

}

