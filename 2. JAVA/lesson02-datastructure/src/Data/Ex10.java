package Data;

public class Ex10 {
	public static void main(String[] args) {
		Integer a = 10;
		System.out.println("a1: " + a);
		modify(a);
		System.out.println("a1: " + a);		
		
	}
	public static void modify(Integer input) {
		input = 9;
	}
}
