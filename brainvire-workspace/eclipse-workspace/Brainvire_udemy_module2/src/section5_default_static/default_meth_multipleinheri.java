package section5_default_static;

interface Left {
	default void m1() 
	{
		System.out.println("default Left Interface");
	}

}

interface Right {
	default void m1() 
	{
		System.out.println("default Right Interface");

	}

	class default_meth_multipleinheri implements Left,Right {
		
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("Own Implementation");
			Left.super.m1();
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		default_meth_multipleinheri d = new default_meth_multipleinheri();
		d.m1();

	}
}
}

