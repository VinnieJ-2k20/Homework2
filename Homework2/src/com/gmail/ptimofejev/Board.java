package com.gmail.ptimofejev;

import java.util.Arrays;

public class Board {
	private Shape[] shapes;

	public Board() {

	}

	public Board(Shape[] shapes) {
		super();
		this.shapes = shapes;
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public void addElement(Shape shape, int position) {
		try {
			shapes[position] = shape;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Incorrect position on Board, try again");
		}
	}

	public void removeElement(int position) {
		try {
			shapes[position] = null;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Incorrect position on Board, try again");
		}
	}

	public void showInfo() {
		System.out.println("Current elements on Board: ");
		double totalArea = 0;
		double totalPerimeter = 0;
		for (int i = 0; i < shapes.length; i++) {
			System.out.print("Position " + i + ": ");
			try {
				System.out.println(shapes[i].toString());
				totalArea += shapes[i].getArea();
				totalPerimeter += shapes[i].getPerimeter();
			} catch (NullPointerException e) {
				System.out.println(" Element is empty");
			}
			
		}
		System.out.printf("Total area: %.3f%n", totalArea);
		System.out.printf("Total perimeter: %.3f%n", totalPerimeter);
		
	}

	@Override
	public String toString() {
		return "Board [shapes=" + Arrays.toString(shapes) + "]";
	}

}
