package fahrzeuginfo;

import enums.Fahrzeugklasse;
import enums.Marke;
import enums.Treibstoff;

public class Model {

	private String modelName;
	private Fahrzeugklasse fahrzeugklasse;
	private Marke marke;
	private Treibstoff treibstoff;
	private int anzahlSitzplaetze;
	private Modelpreis modelpreis;
	
	public String getModelName() {
		return modelName;
	}
	
	public Fahrzeugklasse getFahrzeugklasse() {
		return fahrzeugklasse;
	}
	
	public Marke getMarke() {
		return marke;
	}
	
	public Treibstoff getTreibstoff() {
		return treibstoff;
	}
	
	public int getAnzahlSitzplaetze() {
		return anzahlSitzplaetze;
	}
	
	public Modelpreis getModelpreis() {
		return modelpreis;
	}
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public void setFahrzeugklasse(Fahrzeugklasse fahrzeugklasse) {
		this.fahrzeugklasse = fahrzeugklasse;
	}
	
	public void setMarke(Marke marke) {
		this.marke = marke;
	}
	
	public void setTreibstoff(Treibstoff treibstoff) {
		this.treibstoff = treibstoff;
	}
	
	public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
		this.anzahlSitzplaetze = anzahlSitzplaetze;
	}
	
	public void setModelpreis(Modelpreis modelpreis) {
		this.modelpreis = modelpreis;
	}
	
	
}
