package Pratice_Programs;

public class P100_Call_Const {
	P100_Call_Const(int val1, int val2) {
		if (val1 > val2) {
			System.out.println("val-1");
		} else {
			System.out.println("val-2");
		}
	}
}

class second extends P100_Call_Const {
	second() {
		super(9, 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second ob = new second();
		System.out.println(ob);
	}
}
