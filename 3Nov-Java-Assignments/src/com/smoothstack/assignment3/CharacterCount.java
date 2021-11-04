/**
 * 
 */
package com.smoothstack.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class CharacterCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path;
		Character characterToCount;
		
		System.out.println("Please enter the absolute path of the file you want to count characters of.");
		path = scanner.nextLine();
		
		System.out.println("Please enter the character you would like to count.");
		characterToCount = scanner.next().charAt(0);
		
		CharacterCount cc = new CharacterCount();
		cc.countCharacterInFile(path, characterToCount);
		
		scanner.close();
	}
	
	private Integer countCharacterInFile(String path, Character countedCharacter) {
		Integer count = 0;
		
		File file = new File(path);
		try {
			FileReader fileReader = new FileReader(file);
			Character characterRead;
			
			while((characterRead = (char) fileReader.read()) > 0) { // Loop through file content and count desired character
				if(characterRead == countedCharacter) {
					count++;
				}
			}
			
			fileReader.close();
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
			System.out.println("Could not find file: " + path);
			System.exit(1);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("IOE in appendToFile");
			System.exit(1);
		}
		
		return count;
	}

}
