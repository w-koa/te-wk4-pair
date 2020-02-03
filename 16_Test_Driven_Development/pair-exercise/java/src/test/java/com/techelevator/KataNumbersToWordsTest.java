package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataNumbersToWordsTest {

	KataNumbersToWords numbers = new KataNumbersToWords();
	@Test
	public void tests_that_1_returns_one() {
		String expected = "One";
		String actual = numbers.convertNumberToWord(1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void tests_that_10_returns_ten() {
		String expected = "Ten";
		String actual = numbers.convertNumberToWord(10);
		assertEquals(expected, actual);
	}
}
