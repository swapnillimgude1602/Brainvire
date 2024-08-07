package Pratice_Programs;

import java.util.Scanner;

public class P44_Cal_standardDeviation {
	static double num[] = new double[6], x, mean, dev, sum = 0, sum2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter six numbers: ");
		for (int i = 0; i < num.length; i++) {
			x = sc.nextDouble();
			num[i] = x;
			sum += num[i];
		}
		mean = sum / num.length;

		for (int i = 0; i < num.length; i++) {
			sum2 += Math.pow(num[i] - mean, 2);
		}

		dev = Math.sqrt(sum2 / (num.length - 1));
		System.out.println("Mean= "+mean);
		System.out.println("standard Deviation= "+dev);
	}

}
