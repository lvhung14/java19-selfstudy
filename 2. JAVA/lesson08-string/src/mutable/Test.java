package mutable;

public class Test {
	public static void main(String[] args) {
		String s1 = "hung2.le";
		String s2 = "hung2";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(("---- " + s2+".le") == s1);
		s1 = s2;
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}
