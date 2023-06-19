package inheritance;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB1", "Math01", 120, "ND", Level.BASIC);
		TextBook tb2 = new TextBook("TB2", "Math01", 120, "ND", Level.ADVANCE);
		ReferanceBook rf1 = new ReferanceBook("Rf1", "Math02", 120, "ND", 10d);
	
		System.out.println(tb1);
		System.out.println(tb2);
		System.out.println(rf1);
	}
}
