package Pratice_Programs;

//through getter setter methods
class Access {
	private int number;
	private String name;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class P162_Access_Private_Mem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access as = new Access();
		as.setNumber(1);
		as.setName("swapnil");
		System.out.println(as.getNumber());
		System.out.println(as.getName());

	}

}
