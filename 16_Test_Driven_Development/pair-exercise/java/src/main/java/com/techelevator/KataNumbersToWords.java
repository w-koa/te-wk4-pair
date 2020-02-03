package com.techelevator;

public class KataNumbersToWords {

	// Attributes
	char[] numberChars = new char[6];
	String[] singleDigits = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine" };
	String[] tens = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
			"Seventeeen", "Eighteen", "Nineteen" };

	String[] multipleTen = new String[] {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	public String convertNumberToWord(int num) {
		
		int numLength = numberChars.length;
		
		if (numLength > 1) {
			return singleDigits[num];
		}
		
		if (num>=10 && num<20) {
			
			return tens[num-10];
		}
		
		if (num == 0) {
			return singleDigits[0];
		}
//		if (num > 0) {
//			return singleDigits[num];
//		}

		return null;
	}

}
