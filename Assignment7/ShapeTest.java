package a7;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle(3, "T1", 3, 6);
		Triangle t2 = new Triangle(3, "T2", 5, 9);
		Circle c1 = new Circle(0, "C1", 0.25);
		Circle c2 = new Circle(0, "C2", 1.36);
		Rectangle r1 = new Rectangle(4, "R1", 5, 3);
		Rectangle r2 = new Rectangle(4, "R2", 4, 0);
		Hexagon h1 = new Hexagon(6, "H1");
		Hexagon h2 = new Hexagon(6, "H2");
		
		ArrayList<Shape> a1 = new ArrayList<Shape>();
		
		a1.add(t1);
		a1.add(t2);
		a1.add(c1);
		a1.add(c2);
		a1.add(r1);
		a1.add(r2);
		a1.add(h1);
		a1.add(h2);
		
		
		
		Shapes<Shape> s1 = new Shapes<Shape>(a1);
		
		System.out.println("The shape with the max area is: " + "\n " + s1.maxArea());
		System.out.println("The shape with the min area is" + "\n " + s1.minArea());
		for(Shape sh : s1.getShapeList())
			s1.serialList(sh);
		
		for(Shape s : s1.getShapeList())
			s.start();
			
	
		
		
		
		
		
	}

}
