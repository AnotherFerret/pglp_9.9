package formes;

public class Rectangle extends Forme {
	
	double longueur;
	double largeur;
	
	public Rectangle(String id, double longueur, double largeur, double x1, double x2, double y1, double y2)
	{
		super(id, "Rectangle", x1, x2, y1, y2);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("Ma largeur est " + largeur + " ma longueur est : " + longueur + "\n");
	}
}
