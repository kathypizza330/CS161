

import java.util.ArrayList;

public class Rectangle extends Shape {
	private int width = 0;
	private int height = 0;

	public Rectangle(int width, int height, int position_x, int position_y) {
		super(position_x, position_y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public double area() {
		return width * height;
	}

	public double perimeter() {
		double d = 2 * width + 2 * height;
		return d;
	}

	public boolean resize(double ratio) {
		if (ratio <= 0)
			return false;
		else {
			width *= ratio;
			height *= ratio;
			return true;
		}
	}

	public String toString() {
		return super.toString() + ",height " + height + ", width " + width;

	}

	public boolean equals(Object a) {
		if (super.equals(a)) {
			Rectangle b = (Rectangle) a;
			if ((b.getWidth() == this.width) && (b.getHeight() == this.height))
				return true;
			else
				return false;
		} else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,3,1,1);
		Rectangle r2 = new Rectangle(2,2,1,1);
		Rectangle r3 = new Rectangle(4,6,2,1);
		Rectangle r4 = new Rectangle(1,1,2,2);
		
		System.out.println("r1 has the width of 2: "+r1.getWidth());
		System.out.println("r2 has the height of 2: "+r2.getHeight());
		System.out.println("r3 has the area of 24: "+r3.area());
		System.out.println("r4 has the perimeter of 4: "+r4.perimeter());
		System.out.println("Let's resize r3 by 0.5: "+r3.resize(0.5));
		System.out.println("Then we get the width of r3 is 2: "+r3.getWidth()+", and the height is 3: "+r3.getHeight());
		System.out.println("The area is 6 now: "+r3.area()+", and the perimeter is 10 now: "+r3.perimeter());
		System.out.println("r4 is: "+r4.toString());
		System.out.println("Comparing r1 with r1 should return true: "+r1.equals(r1));
		System.out.println("Comparing r1 with r2 shoule return false: " +r1.equals(r2));
		System.out.println("Also false while comparing r1 with r4: "+r1.equals(r4));
		
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(r1);
		rectangles.add(r2);
		rectangles.add(r3);
		rectangles.add(r4);
		
		//Find the largest rec
		Rectangle a = rectangles.get(0);
		for (Rectangle x : rectangles){
			if (x.larger(a))
				a = x;
		}
		System.out.println("The largest rectangle is: "+a);
		
		//Whether contains rentangle at (5,6). width=4 and height=2
		Rectangle o =new Rectangle(4,2,5,6);
		System.out.println("Return false before I add it: "+rectangles.contains(o));
		rectangles.add(o);
		System.out.println("Return true after I add it: "+rectangles.contains(o));
	}

}
