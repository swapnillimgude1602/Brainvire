package section8_PredefinedFunction_Consumer;

import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c = s -> s.length();
		c.accept("Swapnil");
		c.accept("Swapnillimgude");


	}

}
