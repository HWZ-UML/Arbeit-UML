package kundeninfo;

import fahrzeuginfo.Auto;

public class Kundenmanagement {

	private HashMap<String, Kunde> kundenliste;

public kundenmanagement() {
	kundenliste = new HashMap();	
}

	public Kunde getKunde(String benutzername) {
		return kunden.get(benutzername);
	}

	public int getSize() {
		return kunden.size(); // gibt Anz. Listenelemente zurück, wird für Kundennummer verwendet/ beginnt bei
								// 0
	}

	public void hinzufügenKunde(Kunde kunde) {
		kundenliste.put(kunde.getBenutzername(), kunde); // fügt eîn bestehender Kunde der Liste hinzu / Kunde wird in Klasse Kunde erzeugt
	}
}
