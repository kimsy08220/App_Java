package oop.poly;

class Shape {
	public void draw() {
		System.out.println("Shape 도형을 그린다.");
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line을 그린다.");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect를 그린다.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle을 그린다.");
	}
}

public class PolyMain {
	
	public static void paint(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		
		Shape p = new Shape();
		paint(p);
		paint(new Line());				// Line line = new Line(); paint(line); 으로 표현 가능
		paint(new Rect());				// Rect rect = new Rect(); paint(rect); 으로 표현 가능
		paint(new Circle());			// Circle circle = new Circle(); paint(circle); 으로 표현 가능

	}

}
