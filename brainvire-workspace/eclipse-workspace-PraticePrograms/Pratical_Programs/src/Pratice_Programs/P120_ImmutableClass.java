package Pratice_Programs;
//no setter methods
//class final so no sub class
//instance final so cannot change value
final class immutableClass {
	final int phoneNumber;

	public immutableClass(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}
}

public class P120_ImmutableClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		immutableClass obj = new immutableClass(1234);
		int phn=obj.getPhoneNumber();
		System.out.println("phone num: "+ phn);
	}

}
