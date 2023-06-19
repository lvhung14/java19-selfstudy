package immutable;

public class Ex08FortmatString {
	public static void main(String[] args) {
		String textss = "wElcome  +, To ---    jaVa15 Class";
		System.out.println(format(textss));
	}

	public static String format(String text) {
		//String[] words = text.split("[\\s+,-]+");
		String[] words = text.split("[\\s+,-]{1,}");
		String formattedText = "";
		for (String word : words) {
			String fortmattedWord = Character.toUpperCase(word.charAt(0))
					+ word.substring(1).toUpperCase();
			formattedText += fortmattedWord + " ";
		}
		return formattedText;
	}
}
