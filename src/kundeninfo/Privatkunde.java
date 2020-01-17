package kundeninfo;
import java.util.Date;

public class Privatkunde extends Kunde{ // wie bei Firmenkunde Konstruktor erstellen

	private String vorname;
	private Date geburtsdatum;
	
	public String getVorname() {
		return vorname;
	}
	
	public Date getGeburtsdatum() {
		return geburtsdatum;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	public Privatkunde(String name, String benutzername, 
			char passwort, double umsatz, Login gesperrt, 
			Login login, Fuehrerschein nummer, 
			Fuehrerschein ablaufdatum, Adresse strasse, 
			Adresse hausnummer) {
		super(name);
	
	}
	}


	


