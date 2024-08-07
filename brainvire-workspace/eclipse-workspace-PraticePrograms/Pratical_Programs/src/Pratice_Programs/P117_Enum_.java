package Pratice_Programs;

enum standard {
	FIRST, SECOND, THIRD
}

public class P117_Enum_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		standard std = standard.FIRST;
		switch (std) {
		case FIRST:
			System.out.println("Student is in first Standard");
			break;
		case SECOND:
			System.out.println("Student is in first Standard");
			break;
		case THIRD:
			System.out.println("Student is in THIRD Standard");
			break;
		}
	}
}
