package Pratice_Programs;

public class P82_Check_Numeric {

	public static boolean number(String str) {
		int num;
		try {
			num = Integer.parseInt(str);
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(number("10")){
			System.out.println("Its a number");
		}
		else {
			System.out.println("Its not a snumber");

		}
	}

}
