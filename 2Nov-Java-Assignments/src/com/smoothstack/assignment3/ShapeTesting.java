
/**
 * Testing the implementation of the Shape interface
 */
package com.smoothstack.assignment3;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class ShapeTesting {

	public static void main(String[] args) {
		List<Shape> shapes = new LinkedList<Shape>();

		shapes.add(new Circle(3f));
		shapes.add(new Rectangle(4f, 2f));
		shapes.add(new Triangle(2f, 1f));

		for (Shape shape : shapes) {
			shape.display(); // Shows message saying area hasn't been calculated yet
		}

		for (Shape shape : shapes) {
			shape.calculateArea(); // Calculates the area of each shape
		}

		for (Shape shape : shapes) {
			shape.display(); // Displays the area of each shape
		}

	}

}
