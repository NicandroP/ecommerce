package ecommerce;

public class RigaOrdine {
	final Prodotto p;
	int quantita;
	
	public RigaOrdine (Prodotto p){
		this.p=p;	
	}
	
	public RigaOrdine (Prodotto p,int quantita){
		this.p=p;
		if(quantita<0){
			this.quantita=0;
		}else this.quantita=quantita;	
	}
	
	public void setQuantita (int quantita){
		this.quantita=0;
		if(quantita>0)this.quantita=quantita;
	}
	
	public RigaOrdine copia(){
		return this;
	}
	
	public String toString(){
		if(this.quantita>0){
			return this.p+" "+this.quantita;
		}
		return null;
	}

}
