package formes;

public class Cercle extends Forme {
	double rayon;
	
	Cercle(String id, double rayon, double x1, double x2, double y1, double y2)
	{
		super(id, "Cercle", x1, x2, y1, y2);
		this.rayon = rayon;
	}
	
	public boolean afficheForme()
	{
		super.afficheForme();
		System.out.print("Mon rayon est" + rayon + "\n");
		return true;
	}
	
}
