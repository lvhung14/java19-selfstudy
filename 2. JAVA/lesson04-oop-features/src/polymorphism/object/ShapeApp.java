package polymorphism.object;

public class ShapeApp {
	/*
	 * 1.Tại sao không khai báo trực tiếp KDL lúc compile và runtime giống nhau
	 * + Áp dụng factory pattern
	 * + Dễ dàng chuyển đổi kiểu dữ liệu qua về
	 * 
	 * 2. Nếu lấy KDL của lớp con new KDL của lớp cha có được không
	 * 
	 * 3. Lấy KDL lúc compile và runtime không có quan hệ được không
	 */
	public static void main(String[]  args) {
		Shape shapeRect = ShapeFactory.createShape(ShapeType.RECTANGLE);
		shapeRect.draw();
		shapeRect.calS();
		System.out.println("==============");
		Shape shapeSquare = ShapeFactory.createShape(ShapeType.SQUARE);
		shapeSquare.calS();
		shapeSquare.draw();
		
		Rectangle rect = new Rectangle();
		Shape[] shapes = {shapeRect, shapeSquare, rect};
	}
}
