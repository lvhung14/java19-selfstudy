package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Hung");
		int a = sum(3, 4);
		check(a);
	}
	public static void check(int a){
		if(a % 2 == 0) {
			System.out.println(a + " is an odd number");
		}
		else {
			System.out.println(a + " is an even number");
		}
	}
	public static void printf(String name) {
		System.out.println("Hello "+ name);
	}
	public static int sum(int a, int b) {
		return a + b; 
	}
}

