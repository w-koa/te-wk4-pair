package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String filePath = input.nextLine();
		
		System.out.println("Enter a word to search for: ");
		String wordInput = input.nextLine();
		
		System.out.println("Enter a word to replace " + wordInput + " with: ");
		String replaceWord = input.nextLine();
		
		// for pasting: alices_adventures_in_wonderland.txt
		File sourceFile = new File(filePath);
		if (sourceFile.exists() == false) {
			System.out.println("File does not exist");
		} else if (sourceFile.isFile() == false) {
			System.out.println("This is not a file");
		}
		
		try (Scanner fileScanner = new Scanner(sourceFile)){
			while(fileScanner.hasNextLine()) {
				String words = fileScanner.nextLine();
				if (words.contains(wordInput)) {
					String replacedWords = words.replace(wordInput, replaceWord);
					System.out.println(replacedWords.toString());
				}
			}
		} 
		
		input.close();
	}

}
