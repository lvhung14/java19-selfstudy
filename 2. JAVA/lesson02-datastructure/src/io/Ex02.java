package io;

import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		Random random = new Random();
		
		
		int[] digits = {25, 23, 26};
		
		String[] student = {"Nam", "Hung", "Chanh", "Phuc", "Ly"};
		
		int a = random.nextInt(student.length);
		
		System.out.println("Name: " + student[0]);
		System.out.println("Name: " + student[random.nextInt(student.length)]);
		
		
	}
}
