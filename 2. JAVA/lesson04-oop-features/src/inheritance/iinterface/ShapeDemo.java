package inheritance.iinterface;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapeRect = new Rectangle();
		shapeRect.draw();
		shapeRect.calS();
		
		// Anonymous class
		Shape shapeTriangle = new Shape() {
			
			@Override
			public void draw() {
				System.out.println("Drawing a Triangle");
			}
			
			@Override
			public void calS() {
				System.out.println("1/2 * Height * bottom side");
			}
		};
		System.out.println("==============");
		shapeTriangle.draw();
		shapeTriangle.calS();
	}
	
}
