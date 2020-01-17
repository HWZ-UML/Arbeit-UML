package fahrzeuginfo;

import enums.Modellfaktor;

public class Modelpreis {

	private Modellfaktor modelFaktor;
	private double preisProTag;
	private double fixZuschlag;
	private double mwst;
	
	public Modellfaktor getModelFaktor() {
		return modelFaktor;
	}
	
	public double getPreisProTag() {
		return preisProTag;
	}
	
	public double getFixZuschlag() {
		return fixZuschlag;
	}
	
	public double getMwst() {
		return mwst;
	}
	
	public void setModelFaktor(Modellfaktor modelFaktor) {
		this.modelFaktor = modelFaktor;
	}
	
	public void setPreisProTag(double preisProTag) {
		this.preisProTag = preisProTag;
	}
	
	public void setFixZuschlag(double fixZuschlag) {
		this.fixZuschlag = fixZuschlag;
	}
	
	public void setMwst(double mwst) {
		this.mwst = mwst;
	}
}
