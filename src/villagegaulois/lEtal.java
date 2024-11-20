package villagegaulois;

import personnages.Gaulois;
import Produit.IProduit;


public interface lEtal {
	boolean isEtalOccupe();

	Gaulois getVendeur();

	int getQuantite();

	String getProduit();

	void occuperEtal(Gaulois vendeur, IProduit produit, int quantite);

	boolean contientProduit(IProduit produit);

	int acheterProduit(int quantiteAcheter);

	void libererEtal();
	
	String[] etatEtal();
}
