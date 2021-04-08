package ecommerce;

public abstract class Sconto {
	
	final private String descrizione;
	
	public Sconto(String descrizione){
		this.descrizione=descrizione;
	}
	
	abstract public double calcolaSconto(RigaOrdine[] aRO);
	
	public String getDescrizione(){
		return descrizione;
	}
	
}
