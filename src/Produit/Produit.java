package Produit;

public abstract class Produit {
	private String nom;
	private Unite unite;
	
	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getnomProduit() {
		return nom;
	}
	
	public abstract void decrireproduit();
}	
