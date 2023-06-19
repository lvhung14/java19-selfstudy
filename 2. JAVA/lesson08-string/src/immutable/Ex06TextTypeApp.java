package immutable;

public class Ex06TextTypeApp {
	private int uppercase;
	private int lowercase;
	private int number;

	public static void main(String[] args) {
		Ex06TextTypeApp o1 = new Ex06TextTypeApp();
		String s = "aBcD172#@!";
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isLowerCase(letter)) {
				o1.lowercase++;
				continue;
			}
			if (Character.isUpperCase(letter)) {
				o1.uppercase++;
				continue;
			}
			if (Character.isDigit(letter)) {
				o1.number++;
			}
		}
		System.out.println(o1);
	}

	@Override
	public String toString() {
		return "Ex06TextTypeApp [uppercase=" + uppercase + ", lowercase=" + lowercase + ", number=" + number + "]";
	}

}
