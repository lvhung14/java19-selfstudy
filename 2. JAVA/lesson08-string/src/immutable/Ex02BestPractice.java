package immutable;


public class Ex02BestPractice {
	private static final int N = 500000000;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		System.out.println("Time1: " + (System.currentTimeMillis() - start));

		long start1 = System.currentTimeMillis();

		for(int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		System.out.println("Time2: " + (System.currentTimeMillis() - start1));

	}
}
