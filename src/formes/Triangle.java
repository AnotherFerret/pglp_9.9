package formes;

public class Triangle extends Forme {
	double c1;
	double c2; 
	double c3;
	
	Triangle(String id, double c1, double c2, double c3, double x1, double x2, double y1, double y2)
	{
		super(id, "Triangle", x1, x2, y1, y2);
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public boolean afficheForme()
	{
		super.afficheForme();
		System.out.print("Mes côtés mesurent " + c1 + " " + c2 + " " + c3 + "\n" );
		return true;
	}
}
