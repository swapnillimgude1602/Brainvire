package section5_default_static;

interface stat {
	default void m() {
		System.out.println("Default method");
	}
	static void m1() {
		System.out.println("Static method 1");
	}
	public static void m2() {
		System.out.println("Static method 2");
	}
}

public class Static_meth1 implements stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_meth1 s = new Static_meth1();
		s.m();
		stat.m1();
		stat.m2();

	}

}
