package UI;

import formes.Forme;

public class DeplacerFigureCommand implements Command {
	
	Forme f;
	double x;
	double y;
	
	public DeplacerFigureCommand(Forme f, double x, double y)
	{
		this.f = f;
		this.x = x;
		this.y = y;
	}
	
	@Override 
	public void execute() 
	{
		f.bougeForme(this.x, this.y);
	}
}
