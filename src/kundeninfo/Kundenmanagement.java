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
		return kunden.size(); // gibt Anz. Listenelemente zur�ck, wird f�r Kundennummer verwendet/ beginnt bei
								// 0
	}

	public void hinzuf�genKunde(Kunde kunde) {
		kundenliste.put(kunde.getBenutzername(), kunde); // f�gt e�n bestehender Kunde der Liste hinzu / Kunde wird in Klasse Kunde erzeugt
	}
}
