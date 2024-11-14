package Produit;

public class Poisson extends Produit{
	private String date;
	
	public Poisson(String date){
		super("poisson",Unite.PIECE);
		this.date = date;
	}
	
	public void decrireproduit() {
		System.out.println("poisson péché "+date+".\n");
	}
}
