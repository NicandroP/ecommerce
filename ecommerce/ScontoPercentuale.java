package ecommerce;

public class ScontoPercentuale extends Sconto {
	
	final int percentuale;
	
	public ScontoPercentuale(String descrizione,int percentuale){
		super(descrizione);
		if(percentuale<0){
			this.percentuale=0;
		}else if(percentuale>100){
			this.percentuale=100;
		}else this.percentuale=percentuale;
	
	}	
	
	public double calcolaSconto(RigaOrdine[] aRO){
		double totalePrezzo=0;
		double sconto=0;
		for(int i=0;i<aRO.length;i++){
			totalePrezzo+=aRO[i].p.prezzoUnitario*aRO[i].quantita;
		}
		sconto=(totalePrezzo*this.percentuale)/100;
		return sconto;
	}

	public String toString(){
		return "Sconto percentuale del :"+this.percentuale;
	}	 
	
}
