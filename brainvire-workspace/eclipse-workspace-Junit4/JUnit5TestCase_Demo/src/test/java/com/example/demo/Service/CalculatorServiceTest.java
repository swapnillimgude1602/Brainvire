package com.example.demo.Service;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

	@BeforeAll
	public static void init() {
		System.out.println("Before all initialized: ");
	}

	@AfterAll
	public static void terminated() {
		System.out.println("After all terminated");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each executed");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After Each executed");
	}

	@Test
	@DisplayName("This is 1st Test Case")
	public void add2Numbers() {
		System.out.println("testcase: add2Numbers");
		int add2Num = CalculatorService.add2Num(12, 12);
		int actual = add2Num;
		int expected = 24;
		Assertions.assertEquals(actual, expected, "Not matched");
	}

	@Test
	@Disabled
	public void sumNumbers() {
		System.out.println("testcase: sumNumbers");
		int result = CalculatorService.sumNumbers(90, 40, 30, 60);
		int expected = 220;
		Assertions.assertEquals(result, expected, "Not matched");
	}
}
