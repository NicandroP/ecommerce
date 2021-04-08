package ecommerce;

public class ScontoSottrattivo extends Sconto {
	
	final double valore;
	
	public ScontoSottrattivo (String descrizione,double valore){
		super(descrizione);
		if(valore<0){
			this.valore=Math.abs(valore);
		}else this.valore=valore;				
	}	
	
	public double calcolaSconto(RigaOrdine[] aRO){
		return this.valore;
	}

	public String toString(){
		return "Sconto sottrattivo di:"+this.valore;
	}	 
	
}
