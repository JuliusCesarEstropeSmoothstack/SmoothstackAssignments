package com.smoothstack.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.smoothstack.assignment1.BasicLambdas;

class BasicLambasTests {
	
	static BasicLambdas bl;
	
	@BeforeAll
	static void init() {
		bl = new BasicLambdas();
	}

	@Test
	void sortLengthTest() {
		String[] stringArray = new String[] {
				"to", "tre", "1"
		};
		String[] expectedResult = new String[] {
				"1", "to", "tre"
		};
		
		String[] actualResult = bl.sortStringArrayLengthAscending(stringArray);
		
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
	}

	@Test
	void sortReverseLengthTest() {
		String[] stringArray = new String[] {
				"to", "tre", "1"
		};
		String[] expectedResult = new String[] {
				"tre", "to", "1"
		};
		
		String[] actualResult = bl.sortStringArrayLengthDescending(stringArray);
		
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
	}

	@Test
	void sortByFirstCharTest() {
		String[] stringArray = new String[] {
				"Mocha", "maple", "Aardvark", "Zealous"
		};
		String[] expectedResult = new String[] {
				"Aardvark", "Mocha", "Zealous", "maple", 
		};
		
		String[] actualResult = bl.sortStringArrayByFirstChar(stringArray);
		
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
	}
	
	@Test
	void sortByCharacterTest() {
		String[] stringArray = new String[] {
				"aardvark", "echidna", "zealous", "elm", 
		};
		String[] expectedResult = new String[] {
				"echidna", "elm", "aardvark", "zealous"
		};
		Character characterToSortBy = 'e';
		
		String[] actualResult = bl.sortStringArrayByCharacter(stringArray, characterToSortBy);
		
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
	}
	
	@Test
	void sortByCharacterWithUtilTest() {
		String[] stringArray = new String[] {
				"aardvark", "echidna", "zealous", "elm", 
		};
		String[] expectedResult = new String[] {
				"echidna", "elm", "aardvark", "zealous"
		};
		Character characterToSortBy = 'e';
		
		String[] actualResult = bl.sortStringArrayByCharacterWithUtil(stringArray, characterToSortBy);
		
		assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
	}

}
