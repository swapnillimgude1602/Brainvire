package com.example.demo.Service;

public class CalculatorService {

	public static int add2Num(int a, int b) {
		return a + b;
	}

	public static int sub2Num(int a, int b) {
		return a - b;
	}

	public static int mul2Num(int a, int b) {
		return a * b;
	}

	public static double div2Num(double a, double b) {
		return a / b;
	}

	public static int sumNumbers(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;

	}

}
