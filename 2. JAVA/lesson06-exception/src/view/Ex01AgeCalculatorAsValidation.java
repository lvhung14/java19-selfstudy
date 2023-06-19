package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidation {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String bYearAsString = null;
		do {
			System.out.println("Enter birth year: ");
			bYearAsString = sc.nextLine();
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println("~~~ Invalid input ~~~");
		} while (true);
		int bYear = Integer.parseInt(bYearAsString);
		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
	}
}
