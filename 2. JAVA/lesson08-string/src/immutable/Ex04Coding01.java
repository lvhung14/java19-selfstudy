package immutable;

public class Ex04Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";
		System.out.println(s.length());
		System.out.println();
		s = s + s1;
		System.out.println(s);
		for(int i = 0; i< s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("first = " + s.indexOf("A"));
	}
}
