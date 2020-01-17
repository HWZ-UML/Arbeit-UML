package auftrag;
import java.sql.Time;
import java.util.Date;

import enums.Auftragsstatus;
import fahrzeuginfo.Auto;
import kundeninfo.Kunde;

public class Auftrag {

	private int auftragsnummer;
	private Date auftragsdatum;
	private Kunde kunde;
	//private Kunde kundennummer;
	private Auto auto;
	//private Auto fahrzeugnummer;
	private Date datumVon;
	private Date datumBis;
	private Time zeitVon;
	private Time zeitBis;
	private String startOrt;
	private String zielOrt;
	private String einsatzgebiet;
	private Auftragsstatus status;
	
	public int getAuftragsnummer() {
		return auftragsnummer;
	}
	
	public Date getAuftragsdatum() {
		return auftragsdatum;
	}
	
	public Kunde getKunde() {
		return kunde;
	}
	
	public Kunde getKundennummer() {
		return kundennummer;
	}
	
	public Auto getAuto() {
		return auto;
	}
	
public Auto getFahrzeugnummer() {
	return fahrzeugnummer;
}

public Date getDatumVon() {
	return datumVon;
}

 public Date getDatumBis() {
	return datumBis;
}
 
 public Time getZeitVon() {
	return zeitVon;
}
 
 public Time getZeitBis() {
	return zeitBis;
}
 
 public String getStartOrt() {
	return startOrt;
}
 
 public String getZielOrt() {
	return zielOrt;
}
 
 public String getEinsatzgebiet() {
	return einsatzgebiet;
}
 
 public Auftragsstatus getStatus() {
	return status;
}
 
 public void setAuftragsnummer(int auftragsnummer) {
	this.auftragsnummer = auftragsnummer;
}
 
 public void setAuftragsdatum(Date auftragsdatum) {
	this.auftragsdatum = auftragsdatum;
}
 
 public void setKunde(Kunde kunde) {
	this.kunde = kunde;
}
 
 public void setKundennummer(Kunde kundennummer) {
	this.kundennummer = kundennummer;
}
 
 public void setAuto(Auto auto) {
	this.auto = auto;
}
 
 public void setFahrzeugnummer(Auto fahrzeugnummer) {
	this.fahrzeugnummer = fahrzeugnummer;
}
 
 public void setDatumVon(Date datumVon) {
	this.datumVon = datumVon;
}
 
 public void setDatumBis(Date datumBis) {
	this.datumBis = datumBis;
}
 
 public void setZeitVon(Time zeitVon) {
	this.zeitVon = zeitVon;
}
 
 public void setZeitBis(Time zeitBis) {
	this.zeitBis = zeitBis;
}
 
 public void setStartOrt(String startOrt) {
	this.startOrt = startOrt;
}
 
 public void setZielOrt(String zielOrt) {
	this.zielOrt = zielOrt;
}
 
 public void setEinsatzgebiet(String einsatzgebiet) {
	this.einsatzgebiet = einsatzgebiet;
}
 
 public void setStatus(Auftragsstatus status) {
	this.status = status;
}
	
}
