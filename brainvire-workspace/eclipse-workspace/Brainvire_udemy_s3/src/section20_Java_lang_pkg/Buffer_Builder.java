package section20_Java_lang_pkg;

public class Buffer_Builder {

	public static void main(String[] args) {
		
		String str1 = new String("Swapnil");
		StringBuffer str2 = new StringBuffer("Swapnil");	//Thread safe.
		StringBuilder str3 = new StringBuilder("Swapnil");	//Thread Unsafe.
		
		System.out.println(str1.charAt(3));
		System.out.println(str1.concat("Swap"));
		
		System.out.println(str2.capacity());
		System.out.println(str2.append("limgude"));	
		
		System.out.println(str3.capacity());
		System.out.println(str3.insert(2,"A"));
		//replace()
		//charAt
		
		
		
	}

}
