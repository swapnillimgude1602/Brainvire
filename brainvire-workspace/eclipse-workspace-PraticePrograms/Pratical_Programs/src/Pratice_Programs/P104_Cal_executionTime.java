package Pratice_Programs;

public class P104_Cal_executionTime {
	public void add(int a, int b) {
		int res = a+b;
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P104_Cal_executionTime obj = new P104_Cal_executionTime();
		long start = System.nanoTime();
		obj.add(3, 4);
		long end = System.nanoTime();
		
		long exeTime = end - start;
		System.out.println("Execution time: "+exeTime+"Nanoseconds");
	}

}
