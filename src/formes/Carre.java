package formes;

public class Carre extends Forme {
	double cote;
	
	public Carre(String id, double cote, double x, double y)
	{
		super(id, "Carré", x, y);
		this.cote = cote;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("Mes côtés mesurent " + cote + "\n");
	}
	
	public double getCote()
	{
		return this.cote;
	}
}
