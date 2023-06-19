package polymorphism.method;

public class PolyMethodOverload {
	public static void main(String[] args) {
		
	}
	private static int sum(int a, int b) {
		return a + b;
	}
	private static float sum(float a, float b) {
		return a + b;
	}
	private static float sum(int a, int b, int c) {
		return a + b + c;
	}
}
