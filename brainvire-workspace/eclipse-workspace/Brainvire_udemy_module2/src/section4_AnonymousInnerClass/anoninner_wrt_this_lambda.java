package section4_AnonymousInnerClass;

interface demo1 {
	public void m1();
}

public class anoninner_wrt_this_lambda {
	
	int x = 1234;

	public void m2() {
		
		demo1 d = () -> 
		{
			int x=999;						//inside local class var act as local var
			System.out.println(this.x);		//inside lambda this will always refer to outer class var only
											//local var refrenced from lambda will be final
		};
		d.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anoninner_wrt_this_lambda t = new anoninner_wrt_this_lambda();
		t.m2();
	}

}
