package UI;

import formes.GroupeForme;

public class DeplacerGroupCommand implements Command {
	
	GroupeForme f;
	double x;
	double y;
	
	public DeplacerGroupCommand(GroupeForme f, double x, double y)
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
