package kundeninfo;

public class Firmenkunde extends Kunde{

	private String referenz;
	
	public Firmenkunde(int kundenummer, String name) {//... alle Attribute von Kunde und Firmenkunden
 this.referenz = referenz; // bei Subklassen nur für neues Attribut this. ..., da bei Kunde bereits angelegt
	super(kundenummer, name, ) // .... für alle Kundenattribute
	}
		
	public String getReferenz() {
		return referenz;
	}
	
	public void setReferenz(String referenz) {
		this.referenz = referenz;
	}
}
