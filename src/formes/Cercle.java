package formes;

public class Cercle extends Forme {
	double rayon;
	
	public Cercle(String id, double rayon, double x1, double y1)
	{
		super(id, "Cercle", x1, y1);
		this.rayon = rayon;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("Mon rayon est " + rayon + "\n");
	}
	public double getRayon()
	{
		return this.rayon;
	}
}
