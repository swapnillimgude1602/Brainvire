package Pratice_Programs;

public class P102_LanbdaEX_methArgument {

	interface addition {
		public void add(int a, int b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition ad = (a, b) -> System.out.println("adddn" + a + b);
		ad.add(2, 3);
	}

}
