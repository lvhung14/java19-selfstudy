package enumeration;

public enum CirclePos {
	INSIDE("inside"),
	OUTSIDE("outside"),
	ONSITE("onsite");
	
	private String localized;
	
	private CirclePos(String pLocalized) {
		this.localized = pLocalized;
	}
	
	public String getLocalized() {
		return this.localized;
	} 
}
