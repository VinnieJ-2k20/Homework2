package com.gmail.ptimofejev;

public class Circle extends Shape {
	private Point center;
	private Point radius;

	public Circle() {
		super();
	}

	public Circle(Point center, Point radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getRadius() {
		return radius;
	}

	public void setRadius(Point radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double rad = Math.sqrt(Math.pow(radius.getX() - center.getX(), 2) + Math.pow(radius.getY() - center.getY(), 2));
		double area = Math.PI * Math.pow(rad, 2);
		return area;
	}

	@Override
	public double getPerimeter() {
		double rad = Math.sqrt(Math.pow(radius.getX() - center.getX(), 2) + Math.pow(radius.getY() - center.getY(), 2));
		double perimeter = 2 * Math.PI * rad;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}

}
