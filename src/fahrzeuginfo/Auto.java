package fahrzeuginfo;
import java.util.Date;

import enums.Farbe;
import enums.Status;

public class Auto {  //Kundenmanagement für Auto erstellen und in Start anlegen

	private int fahrzeugnummer;
	private String kennzeichen;
	private int kilometerstand;
	private Date zulassung;
	private Model model;
	private Status status = Status.verfuegbar;
	private Farbe farbe;

	public int getFahrzeugnummer() {
		return fahrzeugnummer;
	}
	
	public String getKennzeichen() {
		return kennzeichen;
	}
	
	public int getKilometerstand() {
		return kilometerstand;
	}
	
	public Date getZulassung() {
		return zulassung;
	}
	
	public Model getModel() {
		return model;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public Farbe getFarbe() {
		return farbe;
	}
	
	public void setFahrzeugnummer(int fahrzeugnummer) {
		this.fahrzeugnummer = fahrzeugnummer;
	}
	
	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	
	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}
	
	public void setZulassung(Date zulassung) {
		this.zulassung = zulassung;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
}
