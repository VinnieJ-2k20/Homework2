package com.gmail.ptimofejev;

/* 1. —оздайте абстрактный класс Shape, в котором есть два
абстрактных метода double getPerimetr() и double getArea().
2. —оздайте класс Point, в котором есть два свойства double x
double y.
3. —оздайте классы, которые описывают, как минимум, три
геометрические фигуры (они должны быть подклассами
Shape). ѕри этом они в качестве свойств должны содержать
классы Point.
4. —оздайте класс доска. ƒоска поделена на 4 части в каждую
часть доски можно положить одну из фигур. ” доски должны
быть методы которые помещают и удал€ют фигуру с доски.
“акже должен быть метод который выводит информацию о
всех фигурах лежащих на доске и их суммарную площадь.
5. * Ќарисуйте UML диаграмму проекта. */

public class Main {

	public static void main(String[] args) {

		Board board = new Board(new Shape[4]);
		Circle circ1 = new Circle(new Point(0, 0), new Point(0, 4));
		Triangle tri1 = new Triangle(new Point(4, 0), new Point(-4, 0), new Point(0, -3));
		Square sq1 = new Square(new Point(0, 0), new Point(0, 4), new Point(4, 4), new Point(4, 0));
		Diamond diam1 = new Diamond(new Point(0, 0), new Point(8, 0), new Point(2, 4), new Point(-2, 4));
		
		board.showInfo();
		
		board.addElement(circ1, 0);
		board.addElement(tri1, 1);
		board.addElement(sq1, 2);
		board.addElement(diam1, 3);
		
		board.showInfo();

		board.removeElement(2);
		
		board.showInfo();
	}

}
