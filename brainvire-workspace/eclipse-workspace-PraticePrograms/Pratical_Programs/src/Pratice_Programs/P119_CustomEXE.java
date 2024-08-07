package Pratice_Programs;

class invalidAgeException extends Exception {
	public invalidAgeException(String str) {
		super(str);
	}
}

public class P119_CustomEXE {
	static void validate(int age) throws invalidAgeException {
		if (age > 18) {
			try {
				throw new invalidAgeException("Allowed");
			} catch (invalidAgeException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Not Allowed");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(34);
		} catch (invalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
