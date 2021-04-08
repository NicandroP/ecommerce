package ecommerce;

public class Cliente {
	
	private final String nome;
    private final String cognome;
	private final String CF; 
	private String indirizzo;
	
	public Cliente (String nome,String cognome,	String CF){
		this.nome=nome;this.cognome=cognome;this.CF=CF;
	}
	
	public Cliente (String nome,String cognome,	String CF,String indirizzo){
		this.nome=nome;this.cognome=cognome;this.CF=CF;
		this.indirizzo=indirizzo;
	}
	
	public Cliente getCliente(){
		return this;
	}
	
	public void setIndirizzo (String indirizzo){
		this.indirizzo=indirizzo;
	}
	
	public String getIndirizzo (){
		return this.indirizzo;
	}
	
	public String toString(){
		if(this.indirizzo!=null){
			return this.cognome+" "+this.nome+" "+this.indirizzo+" "+this.CF;
		}else return this.cognome+" "+this.nome+" "+this.CF;
	}
	
}
