package ecommerce;

public class Prodotto {
	
    final String nome;
	final String descrizione;
	protected double prezzoUnitario;
	
	public Prodotto (String nome,String descrizione){
		this.nome=nome;this.descrizione=descrizione;
		this.prezzoUnitario=-1;
	}
	
	public Prodotto(String nome,String descrizione,double prezzoUnitario){
			this.nome=nome;this.descrizione=descrizione;
			this.prezzoUnitario=Math.abs(prezzoUnitario);
			
	}

	public void setPrezzoUnitario (double prezzoUnitario){
		this.prezzoUnitario=Math.abs(prezzoUnitario);
	}
	
	public String toString(){
		if (this.prezzoUnitario!=-1){
			return this.nome+" "+this.descrizione+" "+this.prezzoUnitario;
		}else return this.nome+" "+this.descrizione;
	}

}
