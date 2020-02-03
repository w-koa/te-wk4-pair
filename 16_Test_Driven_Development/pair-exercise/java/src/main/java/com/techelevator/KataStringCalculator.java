package com.techelevator;

public class KataStringCalculator {

	public int add(String string) {
		if (string.equals("")) {
			return 0;
		} else {
			int sum = 0;
			String[] stringArray = string.split(",");
			for (String str : stringArray) {
				int tempInt = Integer.parseInt(str);
				sum += tempInt;
			}
			return sum;
		}
		
	}

	
}
