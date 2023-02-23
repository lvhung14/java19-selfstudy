package bean;

public class item {
	public int id;
	public String name;
	public double price;
	
	
	public item(int pID, String pName, double pPrice) {
		this.id = pID;
		this.name = pName;
		this.price = pPrice;
	}
	//@Override

	public String toString() {
		return this.id + ", " + this.name + ", " + this.price;
	}
}
