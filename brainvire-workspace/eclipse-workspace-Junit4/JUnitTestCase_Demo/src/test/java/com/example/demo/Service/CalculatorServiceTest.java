package com.example.demo.Service;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class CalculatorServiceTest {

	int counter = 0;

	public void count() {
		for (int i = 0; i < 200; i++) {
			counter += i;
		}
	}

	/// for open a file
	@BeforeAll
	public static void init() {
		System.out.println("Before all test cases: ");
		System.out.println("TestCase Started: " + new Date());
	}

	@BeforeEach
	public void beforeEachTestCase() {
		System.out.println("Test case before each testcase");
		counter = 0;
	}

	@Test
	public void add2NumTest() {
		count();
		System.out.println("testcase: add2NumTest");
		int result = CalculatorService.add2Num(12, 24);
		int expected = 36;
		System.out.println("Counter add2num :" + counter);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void sub2Num() {
//		count();
		for (int i = 0; i < 400; i++) {
			counter += i;
		}
		System.out.println("testcase: sub2Num");
		int result = CalculatorService.sub2Num(20, 40);
		int expected = -20;
		System.out.println("Counter sub2num :" + counter);
		Assert.assertEquals(expected, result);
	}

	@Test
	public void mul2Num() {
		System.out.println("testcase: mul2Num");
		int result = CalculatorService.mul2Num(90, 40);
		int expected = 3600;
		Assert.assertEquals(expected, result);
	}

//	@Test
//	public void div2Num() {
//		double result = CalculatorService.div2Num(4.0,2.0);
//		double expected = 2.0;
//		Assert.assertEquals(expected, expected);
//	}

	@Test
	public void sumNumbers() {
		count();
		System.out.println("testcase: sumNumbers");
		int result = CalculatorService.sumNumbers(90, 40, 30, 60);
		int expected = 220;
		System.out.println("Counter sub2num :" + counter);
		Assert.assertEquals(expected, result);

	}

	@AfterAll
	public static void terminate() {
		System.out.println("After all test case pass");
		System.out.println("End test case: " + new Date());

	}
}
