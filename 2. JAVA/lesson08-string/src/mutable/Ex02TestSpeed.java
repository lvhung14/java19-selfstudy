package mutable;

public class Ex02TestSpeed {
	public static final int RUNNING = 1000000;
	public static void main(String[] args) {
		String s = "Hello ";
		long start = System.currentTimeMillis();
		for(int i = 0; i < RUNNING; i++) {
			String a = "Hello ";
			s += a;
		}
		System.out.println("T1 = " + (System.currentTimeMillis() - start));
		
		StringBuilder s1 = new StringBuilder("Hello ");
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < RUNNING; i++) {
			s1.append("Hello ");
		}
		System.out.println("T1 = " + (System.currentTimeMillis() - start1));
	}
}
