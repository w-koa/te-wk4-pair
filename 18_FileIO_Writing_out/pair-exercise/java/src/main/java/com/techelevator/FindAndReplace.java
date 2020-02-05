package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws FileNotFoundException {
		// Get User Inputs for Source path, search word, replacement word, and output path.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file path: ");
		String filePath = input.nextLine();
		
		System.out.println("Enter a word to search for: ");
		String wordInput = input.nextLine();
		
		System.out.println("Enter a word to replace " + wordInput + " with: ");
		String replaceWord = input.nextLine();
		
		System.out.println("Enter a new file path to save with word replacements (include .txt): ");
		String newPath = input.nextLine();
		
		// Source File
		// for pasting: alices_adventures_in_wonderland.txt
		File sourceFile = new File(filePath);
		if (sourceFile.exists() == false) {
			System.out.println("File does not exist - exiting program");
			System.exit(0);
		} else if (sourceFile.isFile() == false) {
			System.out.println("This is not a file - exiting program");
			System.exit(0);
		}
		// Creates new file to save replacement words.
		// If file name does not contain (.txt), states needs .txt and ends program.
		File replacedWordsFile = new File(newPath);
		PrintWriter writer = null;
		try {
			if (!replacedWordsFile.getName().contains(".txt")) {
				System.out.println("Needs .txt extension");
				System.exit(0);
			}
			writer = new PrintWriter(replacedWordsFile);
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be written to - exiting program");
			e.printStackTrace();
			System.exit(0);
		}
		
		// Reads file one line at a time and prints if no search word is found.
		// If a search word is found, replaces it with replacement word and prints to file.
		try (Scanner fileScanner = new Scanner(sourceFile)){
			while(fileScanner.hasNextLine()) {
				String words = fileScanner.nextLine();
				
				if (words.contains(wordInput)) {
					String replacedWords = words.replace(wordInput, replaceWord);
					writer.println(replacedWords.toString());
					System.out.println(replacedWords.toString());
				} else
					writer.println(words);
				System.out.println(words);
			}
		} 
		// Closes the input and writer.
		writer.close();
		input.close();
	}

}
