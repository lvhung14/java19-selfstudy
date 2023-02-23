package enumeration;

public class Ex01 {
	
	public static void main(String[] args) {
		Point A = new Point(3, 2);
		Point B = new Point(10, 5);
		Circle O = new Circle(new Point(0, 0), 6);
		CirclePos posA = getPos(A, O);
		CirclePos posB = getPos(B, O);
		
		System.out.println("Pos A = " + posA.getLocalized());
		System.out.println("Pos B = " + posB.getLocalized());
}
	private static CirclePos getPos(Point point, Circle circle) {
		double distance = Math.sqrt(Math.pow((point.x - circle.C.x), 2) + Math.pow((point.y - circle.C.y), 2));
		if (distance > circle.R) {
			return CirclePos.OUTSIDE;
		}
		if (distance < circle.R) {
			return CirclePos.INSIDE;
		}
			return CirclePos.ONSITE;
	
	}
}