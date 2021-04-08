package ecommerce;

public class Sconto3Per2 extends Sconto {
	
	public Sconto3Per2 (String descrizione){
		super(descrizione);
	}	
	
	public double calcolaSconto(RigaOrdine[] aRO){
		int a;
		double totale=0;
		for(int i=0;i<aRO.length;i++){
			a=aRO[i].quantita/3;
			totale+=a*aRO[i].p.prezzoUnitario;
		}
		return totale;
	}

	public String toString(){
		return "Sconto "+ this.getDescrizione();
	}	 
	
}
