package section9_PredefinedFunction_Supplier;

import java.util.function.Supplier;
public class Random_PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()->
		{
			Supplier<Integer> si = ()->(int)(Math.random()*10);
			
			String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#$";
			Supplier<Character> sc = ()->symbol.charAt((int)(Math.random()*30));
			
			String password ="";
			for(int i=1;i<=8;i++)
			{
				if(i%2==0)
					password += si.get(); 
				else
					password += sc.get();
			}
			return password;
			
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());


	}

}
