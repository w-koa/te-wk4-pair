package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataStringCalculatorTest {
	
	@Test
	public void tests_that_empty_string_returns_0() {
		KataStringCalculator kataStringCalculator = new KataStringCalculator();
		int expected = 0;
		int actual = kataStringCalculator.add("");
		assertEquals (expected, actual);
	}

	@Test
	public void tests_string_1_returns_int_1() {
		KataStringCalculator kataStringCalc = new KataStringCalculator();
		int expected = 1;
		int actual = kataStringCalc.add("1");
		assertEquals(expected, actual);
	}
	
}
