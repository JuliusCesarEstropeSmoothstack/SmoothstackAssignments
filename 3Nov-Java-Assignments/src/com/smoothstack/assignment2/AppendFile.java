/**
 * 
 */
package com.smoothstack.assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class AppendFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path, contents;
		
		System.out.println("Please enter the absolute path of the file you want to append to.");
		path = scanner.nextLine();
		
		System.out.println("Please enter the content you would like to append to the file.");
		contents = scanner.nextLine();
		
		AppendFile ap = new AppendFile();
		
		ap.appendToFile(path, contents);
		
		System.out.println("Successfully appended contents to file.");
		
		scanner.close();
	}
	
	private void appendToFile(String path, String contents) {
		File file = new File(path);
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(contents); // Write the content to the file
			fileWriter.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("IOE in appendToFile");
			System.exit(1);
		}
	}

}
