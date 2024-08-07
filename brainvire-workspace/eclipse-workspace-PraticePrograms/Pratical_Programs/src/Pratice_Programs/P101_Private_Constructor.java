package Pratice_Programs;

public class P101_Private_Constructor {
	private P101_Private_Constructor() {
		System.out.println("Hello its Private constructor obj must be created");		
		}
	void disp() {
		System.out.println("its a method of class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P101_Private_Constructor priv = new P101_Private_Constructor();
		priv.disp();
	}

}
