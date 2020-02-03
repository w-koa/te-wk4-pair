package com.techelevator;

public class KataNumbersToWords {
	
	// Attributes
	String[] singleDigits = new String[] {"Zero", "One", "Two", "Three",
											"Four", "Five", "Six", "Seven",
											"Eight", "Nine"};
	
	public String convertNumberToWord(int num) {
		if (num == 0) {
			return singleDigits[0];
		}
		if (num > 0) {
			return singleDigits[num + 1];
		}
		
		return null;
	}

}
