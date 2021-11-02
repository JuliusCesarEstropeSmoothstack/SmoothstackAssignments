/**
 * The Rectangle implementation of the Shape interface
 */
package com.smoothstack.assignment3;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Rectangle implements Shape {

	private Float width, height;
	private Float area;

	public Rectangle(Float width, Float height) {
		this.width = width;
		this.height = height;
		area = null;
	}

	@Override
	public void calculateArea() {
		area = width * height; // Calculate the area of a rectangle
	}

	@Override
	public void display() {
		System.out.println( (area == null)? "The rectangle area has not been calculated yet." : "Rectangle Area: " + area); // If area is null, tell the user the area has not been calculated. Otherwise, print the area
	}

}
