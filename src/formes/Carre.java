package formes;

public class Carre extends Forme {
	double cote;
	
	public Carre(String id, double cote, double x1, double x2, double y1, double y2)
	{
		super(id, "Carré", x1, x2, y1, y2);
		this.cote = cote;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("Mes côtés mesurent " + cote + "\n");
	}
}
