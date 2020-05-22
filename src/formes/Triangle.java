package formes;

public class Triangle extends Forme {
	double c1;
	double c2; 
	double c3;
	
	public Triangle(String id, double c1, double c2, double c3, double x1, double y1)
	{
		super(id, "Triangle", x1, y1);
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	
	public void afficheForme()
	{
		super.afficheForme();
		System.out.print("côtés : " + c1 + " " + c2 + " " + c3 + "\n" );
	}
	
	public double getc1()
	{
		return this.c1;
	}
	public double getc2()
	{
		return this.c2;
	}
	public double getc3()
	{
		return this.c3;
	}
}
