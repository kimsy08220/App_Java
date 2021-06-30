package oop.poly;

class Shape {
	public void draw() {
		System.out.println("Shape ������ �׸���.");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line�� �׸���.");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect�� �׸���.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle�� �׸���.");
	}
}

public class PolyMain {
	
	public static void paint(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		
		Shape p = new Shape();
		paint(p);
		paint(new Line());				// Line line = new Line(); paint(line); ���� ǥ�� ����
		paint(new Rect());				// Rect rect = new Rect(); paint(rect); ���� ǥ�� ����
		paint(new Circle());			// Circle circle = new Circle(); paint(circle); ���� ǥ�� ����

	}

}
