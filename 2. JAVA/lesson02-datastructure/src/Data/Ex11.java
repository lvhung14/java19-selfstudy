package Data;

import bean.Digit;

public class Ex11 {
	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		Digit d1 = new Digit(15);
		Digit d2 = new Digit(25);
		swap(d1, d2);
		System.out.println("D1: " + d1);
		System.out.println("D2: " + d2);
	}
	
	private static void swap(Digit first, Digit second) {
		int tempV = first.value;
		first.value = second.value;
		second.value = tempV;
	}
}
