package mutable;

public class Ex01ImmutableVsMutable {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println("s1 hash: " + System.identityHashCode(s));
		s.concat("Join");
		System.out.println("s2 hash: " + System.identityHashCode(s));
		
		StringBuilder str = new StringBuilder("Hello");
		System.out.println(System.identityHashCode(str));
		str.append(" John");
		System.out.println(System.identityHashCode(str));
		
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" Teo");
		System.out.println("sb value: " + sb);
           		
	}
}
