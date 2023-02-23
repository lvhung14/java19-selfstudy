package Data;

public class Ex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a1 " + a);
		System.out.println("b1 " + b);
		swap(a,b);

}
	public static void swap(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a2 " + a);
		System.out.println("b2 " + b);
	}
}