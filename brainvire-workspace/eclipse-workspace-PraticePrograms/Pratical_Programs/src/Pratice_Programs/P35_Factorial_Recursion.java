package Pratice_Programs;

public class P35_Factorial_Recursion {

	static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	// Driver method
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is " + factorial(5));
	}

}
