package UI;

import formes.Forme;

public class PositionnerFigureCommand implements Command{
	Forme f;
	double x;
	double y;
	
	public PositionnerFigureCommand(Forme f, double x, double y)
	{
		this.f = f;
		this.x = x;
		this.y = y;
	}
	
	@Override 
	public void execute() 
	{
		f.positionneForme(this.x, this.y);
	}
}
