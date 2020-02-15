package com.gmail.ptimofejev;

public class Triangle extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {
		super();
	}

	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public double getSideAB() {
		double sideAB = Math
				.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + Math.pow(pointA.getY() - pointB.getY(), 2));
		return sideAB;
	}

	public double getSideBC() {
		double sideBC = Math
				.sqrt(Math.pow(pointB.getX() - pointC.getX(), 2) + Math.pow(pointB.getY() - pointC.getY(), 2));
		return sideBC;
	}

	public double getSideCA() {
		double sideAC = Math
				.sqrt(Math.pow(pointC.getX() - pointA.getX(), 2) + Math.pow(pointC.getY() - pointA.getY(), 2));
		return sideAC;
	}

	@Override
	public double getArea() {
		double halfPer = (getSideAB() + getSideBC() + getSideCA()) / 2.0;
		double area = Math.sqrt(halfPer * (halfPer - getSideAB()) * (halfPer - getSideBC()) * (halfPer - getSideCA()));
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = getSideAB() + getSideBC() + getSideCA();
		return perimeter;
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

}
