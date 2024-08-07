package com.example.demo.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest{

	@Test
	public void add2NumTest() {
		System.out.println("testcase: add2NumTest");
		int result = CalculatorService.add2Num(12, 24);
		int expected = 36;
		Assertions.assertEquals(expected, result);
	}
}
