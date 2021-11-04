/**
 * 
 */
package com.smoothstack.assignment1;

import java.io.File;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class DirectoryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the absolute directory you would like to list");
		String path = scanner.nextLine();

		DirectoryList dl = new DirectoryList();
		dl.ListDirectoryContents(path, 0);
		
		scanner.close();
	}

	private void ListDirectoryContents(String path, Integer depth) {
		File directory = new File(path);
		File[] directoryContents = directory.listFiles();

		for (File file : directoryContents) { // Loop through all files and directories
			for(int i = 0; i < depth; i++) {
				System.out.print('\t'); // Separate subdirectories and files to make identifying the hierarchy easier
			}
			System.out.println(file.getName());
			if (file.isDirectory()) {
				ListDirectoryContents(file.getAbsolutePath(), depth + 1); // If file is a directory, list out its content
			}
		}
	}

}
