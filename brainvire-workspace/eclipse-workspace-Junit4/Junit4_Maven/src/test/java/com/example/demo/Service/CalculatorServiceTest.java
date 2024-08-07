package com.example.demo.Service;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorServiceTest {

	@BeforeClass /// for open a file
	public static void init() {
		System.out.println("Before all test cases: ");
		System.out.println("TestCase Started: " + new Date());
	}
	
	@Before
	public void beforeEachTestCase() {
		System.out.println("Test case before each testcase");
	}

	@Test
	public void add2NumTest() {
		System.out.println("testcase: add2NumTest");
		int result = CalculatorService.add2Num(12, 24);
		int expected = 36;
		Assert.assertEquals(expected, result);
	}

	@Test
	public void sub2Num() {
		System.out.println("testcase: sub2Num");
		int result = CalculatorService.sub2Num(20, 40);
		int expected = -20;
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
		System.out.println("testcase: sumNumbers");
		int result = CalculatorService.sumNumbers(90, 40, 30, 60);
		int expected = 220;
		Assert.assertEquals(expected, result);

	}

	@AfterClass
	public static void terminate() {
		System.out.println("After all test case pass");
		System.out.println("End test case: " + new Date());

	}
}
