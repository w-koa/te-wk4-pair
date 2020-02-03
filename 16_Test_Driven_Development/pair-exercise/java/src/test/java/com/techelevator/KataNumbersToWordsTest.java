package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataNumbersToWordsTest {

	@Test
	public void tests_that_1_returns_one() {

		KataNumbersToWords numbers = new KataNumbersToWords();

		String expected = "one";
		String actual = numbers.convertNumberToWord(1);

	}
}
