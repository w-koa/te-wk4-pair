package com.techelevator;

public class KataNumbersToWords {

	// Attributes
	String[] singleDigits = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	String[] tens = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeeen", "Eighteen", "Nineteen" };

	public String convertNumberToWord(int num) {
		if (num>=10 && num<20) {
			
			return tens[num-10];
		}
		
		if (num == 0) {
			return singleDigits[0];
		}
		if (num > 0) {
			return singleDigits[num];
		}

		return null;
	}

}
