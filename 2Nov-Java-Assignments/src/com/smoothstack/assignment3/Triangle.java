/**
 * The Triangle implementation of the Shape Interface
 */
package com.smoothstack.assignment3;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Triangle implements Shape {

	private Float baseWidth, height;
	private Float area;

	public Triangle(Float width, Float height) {
		this.baseWidth = width;
		this.height = height;
		area = null;
	}

	@Override
	public void calculateArea() {
		area = baseWidth * height * 0.5f; // Calculate the area of a rectangle
	}

	@Override
	public void display() {
		System.out.println( (area == null)? "The triangle area has not been calculated yet." : "Triangle Area: " + area); // If area is null, tell the user the area has not been calculated. Otherwise, print the area
	}
}
