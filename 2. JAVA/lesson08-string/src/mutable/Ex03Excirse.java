package mutable;

public class Ex03Excirse {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("aaabaaabbaaaaaaa");
		int longest = Integer.MIN_VALUE;
		int shortest = Integer.MAX_VALUE;
		int temp2 = 1;
		int count = 0;
		int location = 0;
		int location1 = 0;
		while(true) {
			while(count++ < s.length()) {
				if(count + 1 < s.length() && s.charAt(count) == s.charAt(count + 1)) {
					temp2 += 1;
				}
				else break;
			}
			if(temp2 > longest) {
				longest = temp2;
				location = count - temp2 + 1;
			}
			if(temp2 < shortest) {
				shortest = temp2;
				location1 = count - temp2 + 1;
			}
			temp2 = 1;
			if(count > s.length()) {
				break;
			}
		}
		System.out.println(longest + " location " + "[" + location + "]");
		System.out.println(shortest + " location " + "[" + location1 + "]");
	}
}
