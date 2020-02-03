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
	
	@Test
	public void tests_that_strings_1_and_2_returns_3() {
	KataStringCalculator kataStringCalc = new KataStringCalculator();
	int expected = 3;
	int actual = kataStringCalc.add("1,2");
	assertEquals(expected,actual);
	}
	
	@Test
	public void tests_that_string_5_7_12_returns_24() {
		KataStringCalculator kata = new KataStringCalculator();
		int expected = 24;
		int actual = kata.add("5,7,12");
		assertEquals(expected,actual);
	}
	@Test
	public void tests_that_string_6_2_1_8_returns_17() {
		KataStringCalculator kata = new KataStringCalculator();
		int expected = 17;
		int actual = kata.add("6,2,1,8");
		assertEquals(expected,actual);
	}
	@Test
	public void tests_that_string_5_newline_3_2_returns_10() {
		KataStringCalculator kata = new KataStringCalculator();
		int expected = 10;
		int actual = kata.add("5\n,3,2");
		assertEquals(expected,actual);
		
	}
}
	

