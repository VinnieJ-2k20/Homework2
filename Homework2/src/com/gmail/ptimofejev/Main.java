package com.gmail.ptimofejev;

/* 1. �������� ����������� ����� Shape, � ������� ���� ���
����������� ������ double getPerimetr() � double getArea().
2. �������� ����� Point, � ������� ���� ��� �������� double x
double y.
3. �������� ������, ������� ���������, ��� �������, ���
�������������� ������ (��� ������ ���� �����������
Shape). ��� ���� ��� � �������� ������� ������ ���������
������ Point.
4. �������� ����� �����. ����� �������� �� 4 ����� � ������
����� ����� ����� �������� ���� �� �����. � ����� ������
���� ������ ������� �������� � ������� ������ � �����.
����� ������ ���� ����� ������� ������� ���������� �
���� ������� ������� �� ����� � �� ��������� �������.
5. * ��������� UML ��������� �������. */

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
