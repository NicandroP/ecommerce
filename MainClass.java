import ecommerce.*;
public class MainClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Cliente io=new Cliente("Nicandro","Potena","PTN96NTP6","Via Volturno 2");
		Prodotto pc=new Prodotto("PC","Asus",500);
		Prodotto telefono=new Prodotto("Samsung","S4",300);
		Sconto sconto=new ScontoSottrattivo("Sottrattivo",400);
		Ordine ordine=new Ordine(io);
		ordine.setSconto(sconto);
		ordine.aggiungiProdotto(pc, 4);
		ordine.aggiungiProdotto(telefono, 2);
		System.out.println(io);
		System.out.println(pc);
		System.out.println(telefono);
		System.out.println(sconto);
		System.out.println(ordine);
		ordine.aggiungiProdotto(pc, 6);
		System.out.println(ordine);
		
	}

}
