package Pratice_Programs;

public class P161_Contains_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainString = "This is the main String in java";
		String subStr = "main";

		boolean res = mainString.contains(subStr);
		if (res == true) {
			System.out.println("Main String contains substring");
		} else {
			System.out.println("Main String doesnot contains substring");
		}
	}

}
