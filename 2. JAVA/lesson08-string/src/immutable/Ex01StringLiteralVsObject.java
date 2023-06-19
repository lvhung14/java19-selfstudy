package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		// immutable --> literal (Heap(Constant pool)) & object
		// immutable: bất biến --> không thể cập nhật giá trị của ô nhớ ở HEAP
		String l1 = "hello";
		String l2 = "xin chào";
		String l3 = "hello";
		l1 = "welcome";

		hash("l1 hash: ", l1);
		hash("l2 hash: ", l2);
		hash("l3 hash: ", l3);

		System.out.println("=========================");
		String o1 = new String("language");
		String o2 = new String("text");
		String o3 = new String("Language");
		hash("o1 hash: ", o1);
		hash("o2 hash: ", o2);
		hash("o3 hash: ", o3);
	}

	public static void hash(String text, String a) {
		System.out.println(text + ": " + System.identityHashCode(a));
	}
}
