package kundeninfo;

public class Kunde {

	private int kundennummer;
	private String name;
	private String benutzername;
	private String passwort;
	private double umsatz;
	private boolean gesperrt;
	private boolean login;
	private Fuehrerschein fuehrerschein;
	private Adresse adresse;
	private Zahlungsmittel zahlungsmittel;
	
	public int getKundennummer() {
		return kundennummer;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBenutzername() {
		return benutzername;
	}
	
	public char[] getPasswort() {
		return passwort;
	}
	
	public double getUmsatz() {
		return umsatz;
	}
	
	public boolean getGesperrt() {
		return gesperrt;
	}
	
	public boolean getLogin() {
		return login;
	}
	
	public Fuehrerschein getFuehrerschein() {
		return fuehrerschein;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public Zahlungsmittel getZahlungsmittel() {
		return zahlungsmittel;
	}
	

	public Kunde(String benutzername, String name, ) { //oben in () alle Attribute reinnehmen und unten mit this auflisten
		this.benutzername = benutzername;
		this.name = name;
	}



	}
