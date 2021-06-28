import java.util.Arrays;

class Shape{
	String color = "blue";
	void draw() {
		System.out.println(this.color + "색상의 도형을 그린다.");
	}
}

class Circle extends Shape{
	Point2D center;
	int radius;
	
	Circle(){
		this(new Point2D(0,0), 1);
	}
	Circle(Point2D center, int radius){
		this.center = center;
		this.radius = radius;
	}
	@Override
	void draw() {
		System.out.println(this.color + "색상의 원을 그린다.");
	}
	@Override
	public String toString() {
		return String.format("Circle [center=%s, radius=%s]", center, radius);
	}
}

class Triangle extends Shape{
	Point2D points[];
	
	Triangle() {}
	Triangle(Point2D points[]){
		this.points = points;
	}
	Triangle(Point2D p1, Point2D p2, Point2D p3){
		points = new Point2D[] {p1, p2, p3};
	}
	@Override
	void draw() {
		System.out.println(this.color + "색상의 삼각형을 그린다.");
	}
	@Override
	public String toString() {
		return String.format("Triangle [points=%s]", Arrays.toString(points));
	}
}

class Point2D{
	int x;
	int y;
	
	Point2D(){
		this(0,0);
	}
	Point2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return String.format("Point2D [x=%s, y=%s]", x, y);
	}
}

public class InheritanceTest00 {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		s1.draw();
		
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D(100,100);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point2D(100,100), 100);
		c1.draw();
		
		Point2D points[] = {new Point2D(100,100), new Point2D(200,200), new Point2D(300,300)};
		Triangle t1 = new Triangle(points);
		t1.draw();
	}
}