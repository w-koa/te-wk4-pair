package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("alices_adventures_in_wonderland.txt");
		int wordCount = 0;
		int sentenceCount = 0;
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {

				String line = fileScanner.nextLine();
				
				String[] words = line.trim().split("\\s+");
				for (int i = 0; i < words.length; i++) {
					if (words[i].length() >= 1)
						wordCount++;
				}

				String[] sentences = line.split("[!?:.]");
				if (sentences.length > 1) {
					sentenceCount++;
				}
				

			}
			System.out.println(wordCount);
			System.out.println(sentenceCount);

		}
	}
}
