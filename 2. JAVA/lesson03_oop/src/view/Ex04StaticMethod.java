package view;

public class Ex04StaticMethod {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		System.out.println("r1: " + Ex04StaticMethod.sum(a, b));
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
