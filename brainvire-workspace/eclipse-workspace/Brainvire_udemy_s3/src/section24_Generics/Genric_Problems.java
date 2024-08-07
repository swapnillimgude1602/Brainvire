package section24_Generics;

public class Genric_Problems <T>{
	
    @SuppressWarnings("unchecked")
	T data[] = (T[])new Object[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Genric_Problems<Integer> gp = new Genric_Problems<>();
		gp.data[0]=10;
		gp.data[1]=20;
		gp.data[2]=30;
		//gp.data[3]="hi"; // it is assigned with integer so it will through an error at runtime
		System.out.println(gp);
		
		
	}

}
