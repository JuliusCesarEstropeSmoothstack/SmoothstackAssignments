/**
 * The Circle implementation of the Shape interface
 */
package com.smoothstack.assignment3;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Circle implements Shape {

	private Float radius;
	private Float area;

	public Circle(Float radius) {
		this.radius = radius;
		area = null;
	}

	@Override
	public void calculateArea() {
		area = (float) (Math.PI * Math.pow(radius, 2)); // Calculate the area of a circle
	}

	@Override
	public void display() {
		System.out.println( (area == null)? "The circle area has not been calculated yet." : "Circle Area: " + area); // If area is null, tell the user the area has not been calculated. Otherwise, print the area
	}

}
