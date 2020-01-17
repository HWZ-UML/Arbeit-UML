package kundeninfo;

import java.util.Scanner;
import java.util.Date;

public class Start {

	Kundenmanagement kundenmanagement = new Kundenmanagement(); // Automanagement hier erzeugen
	Scanner scan;
	String eingabe = null;
	Kunde kunde; // Kunde kunde = new Kunde("Steffi",...), anschliessend der Liste hinzufügen &
					// dasselbe beim Auto
	// erzeugungsmethoden für neue Autos

	public static void main(String[] args) { // static wenn es kein Objekt benötigt um die methode aufzurufen
		(new Start()).start(); // sprint in Start-Methode, wird gemacht, damit nicht alle Methoden static
								// gemacht werden müssen
	}

	private void start(){
		
		System.out.println("Sind Sie bereits registriert? J/N");
		scan = new Scanner(System.in);
		eingabe = scan.nextLine();
		
	if(eingabe.equals("J")) {
		System.out.println("Bitte geben Sie Ihren Benutzernamen ein");
		scan = new Scanner(System.in);
		eingabe = scan.nextLine();
		
		String benutzername = eingabe;
		
		System.out.println("Bitte geben Sie Ihr Passwort ein");
		scan = new Scanner(System.in);
		eingabe = scan.nextLine();
		
		String passwort = eingabe;
		
	kunde = login(benutzername, passwort);
	
	if (überprüfeLogin(kunde)) {
		System.out.println("Sie sind nun eingeloggt!");
	}
	
	else if(eingabe.equals("N")) {
	registrieren();
	start();
	}
	
	else { //wenn nichts richtiges eingegeben wird, zurück zum start 
	System.out.println("Ungültige Eingabe!");
	start();
	}
	
	//Autoinformationen
	
	//Auftrag abfüllen
	
	//anzeige(); ausgaben mit system.out.println
	}
	private void registrieren() {
		System.out.println("Sind Sie ein Privatkunde oder Firmenkunde? P/F");
		scan = new Scanner(System.in);
		eingabe = scan.nextLine();
		
		if(!(eingabe.equals("P")||eingabe.equals("F"))) {
			System.out.println("Ungültige Eingabe!");
			registrieren();
		}
		
		String [] Array kundenangaben = new Array[];
		System.out.println("Bitte geben Sie Ihren Namen ein.");
		scan = new Scanner(System.in);
		kundenangaben[0] = scan.nextLine();
		
		System.out.println("Bitte geben Sie einen Benutzernamen ein.");
		scan = new Scanner(System.in);
		kundenangaben[1] = scan.nextLine();
		
		System.out.println("Bitte legen Sie ein Passwort an.");
		scan = new Scanner(System.in);
		kundenangaben[2] = scan.nextLine();
		
		System.out.println("Bitte geben Sie die Nummer Ihres Führerscheins ein.")
		scan = new Scanner(System.in);
		kundenangaben[3] = scan.nextLine();
		
		System.out.println("Bitte geben Sie das Ablaufdatum Ihres Führerscheins ein.\n")
		System.out.println("Tag: ")
		scan = new Scanner(System.in);
		kundenangaben[4] = scan.nextLine();
		
		System.out.println("Monat: ")
		scan = new Scanner(System.in);
		kundenangaben[5] = scan.nextLine();
		
		System.out.println("Jahr: ")
		scan = new Scanner(System.in);
		kundenangaben[6] = scan.nextLine();
		
		int tag = Integer.parseInt(kundenangaben[4]);
		int monat = Integer.parseInt(kundenangaben[5]);
		int jahr = Integer.parseInt(kundenangaben[6]);
		
		Fuehrerschein fuehrerschein = erfasseFuehrerschein(Integer.parseInt(kundenangaben[3]), erfasseDatum(tag, monat, jahr));
		
		System.out.println("Bitte geben Sie Ihre Adressdaten ein\n")
		System.out.println("Strasse: ")
		scan = new Scanner(System.in);
		kundenangaben[7] = scan.nextLine();
		
		System.out.println("Hausnummer: ")
		scan = new Scanner(System.in);
		kundenangaben[8] = scan.nextLine();
		
		System.out.println("Postleitzahl: ")
		scan = new Scanner(System.in);
		kundenangaben[9] = scan.nextLine();
		
		System.out.println("Ort: ")
		scan = new Scanner(System.in);
		kundenangaben[10] = scan.nextLine();
		
		System.out.println("Mail: ")
		scan = new Scanner(System.in);
		kundenangaben[11] = scan.nextLine();
		
		System.out.println("Telefon: ")
		scan = new Scanner(System.in);
		kundenangaben[12] = scan.nextLine();
		
		Adresse adresse = erfasseAdresse(kundenangaben[7], Integer.parseInt(kundenangaben[8]),
				Integer.parseInt(kundenangaben[9]), kundenangaben[10], kundenangaben[11], Integer.parseInt(kundenangaben[12]));
		
		System.out.println("Bitte geben Sie Ihre Zahlungsdaten ein\n")
		System.out.println("Kartenart: ")
		scan = new Scanner(System.in);
		kundenangaben[13] = scan.nextLine();
		
		System.out.println("Kartennummer: ")
		scan = new Scanner(System.in);
		kundenangaben[14] = scan.nextLine();
		
		System.out.println("Ablaufdatum:")
		System.out.println("Tag: ")
		scan = new Scanner(System.in);
		kundenangaben[15] = scan.nextLine();
		
		System.out.println("Monat: ")
		scan = new Scanner(System.in);
		kundenangaben[16] = scan.nextLine();
		
		System.out.println("Jahr: ")
		scan = new Scanner(System.in);
		kundenangaben[17] = scan.nextLine();
		
		int tag = Integer.parseInt(kundenangaben[15]);
		int monat = Integer.parseInt(kundenangaben[16]);
		int jahr = Integer.parseInt(kundenangaben[17]);
		
		Zahlungsmittel zahlungsmittel = erfasseZahlungsmittel(kundenangaben[13], Integer.parseInt(kundenangaben[14]), erfasseDatum(tag, monat, jahr));
		
	if (eingabe.equals("P")) {
		
		System.out.println("Bitte geben Sie Ihren Vornamen ein.");
		scan = new Scanner(System.in);
		kundenangaben[18] = scan.nextLine();
		
		System.out.println("Bitte geben Sie den Tag Ihres Geburtsdatum ein. Bsp. 1 bis 31");
		scan = new Scanner(System.in);
		kundenangaben[19] = scan.nextLine();
		
		System.out.println("Bitte geben Sie Ihren Geburtsmonat ein.");
		scan = new Scanner(System.in);
		kundenangaben[20] = scan.nextLine();
		
		System.out.println("Bitte geben Sie Ihr Geburtsjahr ein.");
		scan = new Scanner(System.in);
		kundenangaben[21] = scan.nextLine();
		
		int tag = Integer.parseInt(kundenangaben[19]);
		int monat = Integer.parseInt(kundenangaben[20]);
		int jahr = Integer.parseInt(kundenangaben[21]);
		
		Date geburtstag = erfasseDatum(tag, monat, jahr);
		
		kunde = erfassePrivatkunde(kundenmanagement.getSize()+1, kundenangaben[1], kundenangaben[2],  ); // kundenangaben und methoden von oben übernehmen! bsp nicht 19,20,21 sondern erfasse geburtsdatum
	}
	else {
		System.out.println("Bitte geben Sie eine Referenz ein.");
		scan = new Scanner(System.in);
		kundenangaben[22] = scan.nextLine();
		
		kunde = erfasseFirmenkunde(); //kundenangaben und methoden von oben übernehmen! bsp nicht 19,20,21 sondern erfasse geburtsdatum
	}

	private Kunde erfassePrivatkunde(int kundennummer, String name) { //.... alle Privatkundenattribute
		Kunde kunde = new Privatkunde(kundennummer, name) // .... alle Attribute ohne Datentyp
				return kunde;
	}

	private Kunde erfasseFirmenkunde(int kundennummer, String name) { //.... alle Firmenkundenattribute
		Kunde kunde = new Firmenkunde(kundennummer, name) // .... alle Attribute ohne Datentyp
				return kunde;
	}

	private Date erfasseDatum(int tag, int monat, int jahr) {
		return new Date(jahr, monat - 1, tag);
	}

	private Fuehrerschein erfasseFuehrerschein(int nummer, Date ablaufdatum) {
		return new Fuehrerschein(nummer, ablaufdatum);
	}

	private Adresse erfasseAdresse(String strasse, int hausnummer, int postleitzahl, String ort, String email,
			int telefon) {
		return new Adresse(strasse, hausnummer, postleitzahl, ort, email, telefon);
	}

	private Zahlungsmittel erfasseZahlungsmittel(Kreditkartenart kreditkartenart, int kartennummer, Date ablaufdatum) {
		return new Zahlungsmittel(kreditkartenart, kartennummer, ablaufdatum);
	}

	private Kunde login(String benutzername, String passwort) {
		if (kundenmanagement.getKunde(benutzername) == null) {
			System.out.println("Benutzer nicht gefunden");
			return null;
		} else {
			Kunde kunde = kundenmanagement.getKunde(benutzername);
			if (kunde.getPasswort().equals(passwort)) {
				erstelleSitzung(kunde);
				return kunde;
			} else {
				System.out.println("Benutzername oder Passwort falsch");
				return null;
			}
		}
	}

	private void erstelleSitzung(Kunde kunde) {
		if (kunde.getLogin()) {
			System.out.println("Der Benutzer ist bereits angemeldet");
		} else {
			kunde.setLogin(true); // könnte für alle Attribute zum Anpassen benutzt werden - Aufwändig
		}
	}

	private boolean überprüfeLogin(Kunde kunde) {
		return kunde.getLogin();
	}

}
