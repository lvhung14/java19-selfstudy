package Data;

import bean.item;

public class Ex09 {
	public static void main(String[] args) {
		item i1 = new item(1, "cake", 50);
		item i2 = new item(2, "Bake", 40);
		item i3 = new item(3, "Kake", 30);
		
		i1.id = 56;
		
		System.out.println("I1: " + i1.toString());
		System.out.println("I1: " + i2.toString());
		System.out.println("I1: " + i3.toString());
	}
}
