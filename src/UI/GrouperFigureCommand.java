package UI;

import formes.GroupeForme;
import formes.Forme;

public class GrouperFigureCommand implements Command{
	
	GroupeForme gf;
	Forme f;
	
	public GrouperFigureCommand(GroupeForme gf, Forme f)
	{
		this.gf = gf;
		this.f = f;
	}

	@Override
	public void execute() {
		gf.addForme(f);
		
	}
	
	
}
