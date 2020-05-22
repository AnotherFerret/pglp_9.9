package UI;

import formes.Forme;
import formes.GroupeForme;

public class DegrouperFigureCommand implements Command{

	GroupeForme gf;
	Forme f;
	
	public DegrouperFigureCommand(GroupeForme gf, Forme f)
	{
		this.gf = gf;
		this.f = f;
	}

	@Override
	public void execute() {
		gf.removeForme(f);
		
	}
	
}
