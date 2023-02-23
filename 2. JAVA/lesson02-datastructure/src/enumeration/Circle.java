package enumeration;

public class Circle {
	public Point C;
	public double R;
	
	public Circle(Point C, int R) {
		this.C = C;
		this.R = R;
	}
	@Override
	public String toString() {
		return "(" + this.C.x + ", " + this.C.y + ", " + this.R + ")";
	}
}
