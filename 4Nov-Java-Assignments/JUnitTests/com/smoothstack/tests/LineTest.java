package com.smoothstack.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.smoothstack.assignment4.Line;

class LineTest {

	/*
	 * A test to verify that the slope of a line passing through
	 * (0, 0) and (4, 2) has a slope of 0.5
	 */
	@Test
	void getSlopeEqualsTest() {
		Double expectedSlope = 0.5;
		
		Line testLine = new Line(0, 0, 4, 2);
		
		assertEquals(expectedSlope, testLine.getSlope(), 0.0001);
	}

	/*
	 * A test to verify that the expectedSlope works 
	 * with negative values
	 */
	@Test
	void getNegativeSlopeEqualsTest() {
		Double expectedSlope = 0.5;
		
		Line testLine = new Line(0, 0, -4, -2);
		
		assertEquals(expectedSlope, testLine.getSlope(), 0.0001);
	}

	/*
	 * A test to verify that the slope of a line passing through
	 * (0, 0) and (1, 1) does not have a slope of 0.5
	 */
	@Test
	void getSlopeNotEqualsTest() {
		Double expectedSlope = 0.5;
		
		Line testLine = new Line(0, 0, 1, 1);
		
		assertNotEquals(expectedSlope, testLine.getSlope(), 0.0001);
	}

	/*
	 * A test to verify the distance between
	 * (0, 0) and (2, 2) is the root of 8
	 */
	@Test
	void getDistanceEqualsTest() {
		Double expectedDistance = Math.sqrt(8);
		
		Line testLine = new Line(0, 0, 2, 2);
		
		assertEquals(expectedDistance, testLine.getDistance(), 0.0001);
	}

	/*
	 * A test to verify the distance between
	 * (0, 0) and (1, 1) is not root of 8
	 */
	@Test
	void getDistanceNotEqualsTest() {
		Double expectedDistance = Math.sqrt(8);
		
		Line testLine = new Line(0, 0, 2, 2);
		
		assertEquals(expectedDistance, testLine.getDistance(), 0.0001);
	}

	/*
	 * A test to verify the distance between
	 * two points works with negative values
	 */
	@Test
	void getNegativeDistanceEqualsTest() {
		Double expectedDistance = Math.sqrt(8);
		
		Line testLine = new Line(0, 0, -2, -2);
		
		assertEquals(expectedDistance, testLine.getDistance(), 0.0001);
	}

	/*
	 * A test to verify two lines are parallel
	 */
	@Test
	void getParallelTo() {
		Line testLine1 = new Line(0, 0, 4, 2);
		Line testLine2 = new Line(-1, -1, 3, 1);
		
		assertTrue(testLine1.parallelTo(testLine2));
	}

	/*
	 * A test to verify two lines are not parallel
	 */
	@Test
	void getNotParallelTo() {
		Line testLine1 = new Line(0, 0, 4, 2);
		Line testLine2 = new Line(-1, -1, 3, 2);
		
		assertFalse(testLine1.parallelTo(testLine2));
	}

}
