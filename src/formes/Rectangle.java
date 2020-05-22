package formes;

public class Rectangle extends Forme {
	
	double longueur;
	double largeur;
	
	public Rectangle(String id, double longueur, double largeur, double x1, double y1)
	{
		super(id, "Rectangle", x1, y1);
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("largeur : " + largeur + " longueur : " + longueur + "\n");
	}

	
	public double getLongueur()
	{
		return this.longueur;
	}
	public double getLargeur()
	{
		return this.largeur;
	}

}
