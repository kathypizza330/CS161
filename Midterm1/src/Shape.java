//Lingyang Zhu
//lyzhu@rams.colostate.edu
//830473764
//02/29/2016
//Section 5

public abstract class Shape {
	protected int position_x = 0, position_y = 0;

	// Constructor
	public Shape(int position_x, int position_y) {
		this.position_x = position_x;
		this.position_y = position_y;
	}

	public void getx(int x) {
		if (x >= 0)
			this.position_x = x;
		else
			this.position_x = 0;
	}

	public void gety(int y) {
		if (y >= 0)
			this.position_y = y;
		else
			this.position_y = 0;
	}

	public boolean equals(Object other) {
		if (other instanceof Shape) {
			return other==this;
		} else
			return false;
	}

	public String toString() {
		return "Location(" + position_x + ", " + position_y + ")";
	}

	public boolean larger(Shape other) {
		if (this.area() > other.area())
			return true;
		else
			return false;
	}

	public abstract double area();

	public abstract double perimeter();

	public abstract boolean resize(double ratio);
}
