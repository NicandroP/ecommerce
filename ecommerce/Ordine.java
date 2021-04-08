package ecommerce;
import java.util.*;

public class Ordine {
	private final Cliente c;
	private String note;
	private ArrayList<RigaOrdine> a;
	private double numeroTotaleArticoli;
	private double totale;
	private Sconto sconto;
	private double valoreSconto;

	public Ordine (Cliente c){
		this.c=c;
	}
	
	public Ordine (Cliente c, String note){
		this.c=c;
		this.note=note;
	}
	
	public void setNote (String note){
		this.note=note;		
	}
	
	public void setSconto (Sconto sconto){
		this.sconto=sconto;	
	}
	
	public RigaOrdine[] arrayRigheOrdine(){
		RigaOrdine[] ris=new RigaOrdine[a.size()];
		for(int i=0;i<a.size();i++){
			ris[i]=a.get(i);
		}
		return ris;
	}
	
	public void aggiungiProdotto (Prodotto p,int quantita){
		boolean trovato=false;
		if(a==null){
			a=new ArrayList<RigaOrdine>();
			RigaOrdine k=new RigaOrdine(p,quantita);
			a.add(k);
			aggiornaTotaliESconto();
			return;
		}
		for(int i=0;i<a.size() && !trovato;i++){
			if(this.a.get(i).p==p){
				trovato=true;
				this.a.get(i).quantita=this.a.get(i).quantita+quantita;
			}
		}
		if(!trovato){
			RigaOrdine b=new RigaOrdine(p,quantita);
			a.add(b);
		}
		aggiornaTotaliESconto();
	}

	public void rimuoviProdotto (Prodotto p,int quantita){
		boolean trovato=false;
		for(int i=0;i<a.size() && !trovato;i++){
			if(this.a.get(i).p==p){
				trovato=true;
				if(quantita>=this.a.get(i).quantita){
					a.remove(i);
				}else{
					this.a.get(i).quantita-=quantita;
					trovato=true;
				}
			}
		}
		if(trovato)aggiornaTotaliESconto();
	}
	
	private void aggiornaTotaliESconto(){
		this.totale=0;
		this.numeroTotaleArticoli=0;
		RigaOrdine[] a=arrayRigheOrdine();
		this.valoreSconto=sconto.calcolaSconto(a);
		for(int i=0;i<a.length;i++){
			totale+=a[i].quantita*a[i].p.prezzoUnitario;
			numeroTotaleArticoli+=a[i].quantita;
		}
		this.totale-=valoreSconto;
	}
	
	public String toString(){
		if(this.note==null){
			return "Cliente : "+this.c+"  /  Acquisti  "+this.a+"  /   Totale: "+this.totale+"  /   "+this.sconto;	
		}else return "Cliente : "+this.c+"  /  Acquisti  "+this.a+"  /   Totale: "+this.totale+"  /   "+this.sconto+"   /  Note: "+this.note;
		
	}	

}
