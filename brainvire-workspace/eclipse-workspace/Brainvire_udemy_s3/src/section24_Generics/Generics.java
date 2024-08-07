package section24_Generics;

class Generics {
	
    static <T> void genericDisplay(T[] element)
    {
        for(T x: element)
        {
        	System.out.println(x);
        }
    }
 
    public static void main(String[] args)
    {
    	// Calling generic method with Integer argument
        genericDisplay(new Integer[] {11,12,23});
 
        // Calling generic method with String argument
        genericDisplay(new String[]{"abcd","efgh"});
 
        // Calling generic method with double argument
        genericDisplay(new Double[]{1.0,2.3});
    }
}