package Pratice_Programs;

interface car {
	public void car();
}

interface bike {
	public void bike();
}

class showroom implements car, bike {

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		System.out.println("This is bike model");
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		System.out.println("This is car model");

	}

	void showroom() {
		System.out.println("This showroom contains car and bike model");

	}

}

public class P130_MultipleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showroom sh = new showroom();
		sh.car();
		sh.bike();
		sh.showroom();
	}

}
