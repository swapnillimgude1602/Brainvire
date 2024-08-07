package section20_Java_lang_pkg;

public class Math_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maths_class
		
		System.out.println("Absolute: "+Math.abs(-52));
		System.out.println("Strict Absolute: "+StrictMath.abs(-522));	//More precise number after decimal
		
		System.out.println("Cube Root: "+Math.cbrt(8));
		
		System.out.println("Maximum: "+Math.max(85, 52));	//maximum value
		
		System.out.println("Power: "+Math.pow(2, 3));
		
		System.out.println("Round Division: "+Math.floorDiv(60, 9)); //gives int value
		
		System.out.println("Random: "+Math.random()*1000);	//Gives Random number
		
		System.out.println("Exact Decrement: "+Math.decrementExact(7));	//Prevent a number to get Underflow
		
		System.out.println("Exact Product: "+Math.multiplyExact(100, 200));	//if no is beyond limit it will throw Exception
		
		System.out.println("Exponent Value in float point: "+Math.getExponent(12.354));
		//results in mantissa(holds digit)expo(where the decimal point should be placed.)
		
		System.out.println("Next Float Value: "+Math.nextAfter(12.5, 11));
		
		System.out.println("Convert to degree: "+StrictMath.toDegrees(StrictMath.tanh(1)));	//Hyperbolic Tan
		
		 System.out.println("Convert to degree: "+Math.toDegrees(Math.atan(1)));	//Arc tan
		
		System.out.println("E power X: "+Math.exp(1));
		
		System.out.println("E power X: "+StrictMath.exp(1));
		
		System.out.println("Log base 10: "+Math.log10(100));
	    
		System.out.println("Tan: "+Math.tan(45*Math.PI/180));	//trgnometric val
        
		System.out.println("Convert to Radians: "+Math.toRadians(90));
       
		System.out.println("Ceil: "+Math.ceil(15.6646));

}
}