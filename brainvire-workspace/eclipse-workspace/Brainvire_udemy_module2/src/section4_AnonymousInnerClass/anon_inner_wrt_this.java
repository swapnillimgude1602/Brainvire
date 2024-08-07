package section4_AnonymousInnerClass;

interface demo
{
	public void m1();
}
public class anon_inner_wrt_this{
	
	int x=1234;
	
	public void m2()
	{
		demo d = new demo() {
			int x=999;	//instance variable
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(this.x);	// this always refers to current class(inner) instance variable
				//System.out.println(anon_inner_wrt_this.this.x);	if to access outer class var x
			}
		};
		d.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anon_inner_wrt_this t = new anon_inner_wrt_this();
		t.m2();
	}

}
