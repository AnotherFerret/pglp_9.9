package formes;

public class Carre extends Forme {
	double cote;
	
	Carre(String id, double cote, double x1, double x2, double y1, double y2)
	{
		super(id, "Carré", x1, x2, y1, y2);
		this.cote = cote;
	}
	
	public boolean afficheForme()
	{
		super.afficheForme();
		System.out.print("Mon côté mesure :" + cote + "\n");
		return true;
	}
}
