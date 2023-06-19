package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println(Arrays.toString(remove(numbers, 3)));
	}

	private static int[] add(int[] elements, int pos, int value) {
		int[] result = new int [elements.length + 1];
		for(int i = 0; i < result.length; i++) {
			if(i < pos) {
				 result[i] = elements[i];
			}
			else if(i == pos) {
				result[i] = value;
			} else {
				result[i] = elements[i - 1];
			}
		}
		return result;
	}
	private static int[] remove(int[] elements, int pos) {
		int[] result = new int [elements.length - 1];
		for(int i = 0; i < result.length; i++) {
			if(i < pos) {
				result[i] = elements[i];
			}
			else {
				result[i] = elements[i + 1];
			}
		}
		return result;
	}
}
