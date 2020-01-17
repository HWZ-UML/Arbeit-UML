package kundeninfo;

import java.util.Date;

import enums.Kreditkartenart;

public class Zahlungsmittel { //Konstruktor bauen 

	private String kreditkartenart;
	private int kreditkartennummer;
	private Date ablaufdatum;
	
public String getKreditkartenart() {
	return kreditkartenart;
}

public int getKreditkartennummer() {
	return kreditkartennummer;
}

public Date getAblaufdatum() {
	return ablaufdatum;
}

public void setKreditkartenart(String kreditkartenart) {
	this.kreditkartenart = kreditkartenart;
}

public void setKreditkartennummer(int kreditkartennummer) {
	this.kreditkartennummer = kreditkartennummer;
}

public void setAblaufdatum(Date ablaufdatum) {
	this.ablaufdatum = ablaufdatum;
}

}
