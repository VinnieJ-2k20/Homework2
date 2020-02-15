package com.gmail.ptimofejev;

public class Square extends Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;

	public Square() {
		super();
	}

	public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
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

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public double getSideAB() {
		double sideAB = Math
				.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + Math.pow(pointA.getY() - pointB.getY(), 2));
		return sideAB;
	}

	@Override
	public double getArea() {
		double area = Math.pow(getSideAB(), 2);
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = getSideAB() * 4;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Square [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + ", pointD=" + pointD + "]";
	}

}
