package inheritance;

/*
 * Book: id, name, price, publisher
 * ReferenceBook: tax
 */

public class ReferanceBook extends Book {
	private double tax;
	
	public ReferanceBook() {
		
	}
	public ReferanceBook(String id, String name, double price, String publisher, double tax) {
		super(id, name, price, publisher);
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
		public String toString() {
			return super.toString() + ", tax = " + tax ;
		}
}
