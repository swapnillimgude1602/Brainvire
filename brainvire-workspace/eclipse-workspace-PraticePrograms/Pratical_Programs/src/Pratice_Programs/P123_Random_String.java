package Pratice_Programs;

import java.util.Random;

public class P123_Random_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdegfhijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder builder = new StringBuilder();
		int length = 10;
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(str.length());
			char randomCh = str.charAt(index);
			builder.append(randomCh);
		}
		String randomString = builder.toString();
		System.out.println("Random String: " + randomString);
	}

}
