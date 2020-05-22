package UI;


import formes.GroupeForme;

public class AfficherFigureCommand implements Command {

	GroupeForme f;
	
	public AfficherFigureCommand(GroupeForme f)
	{
		this.f = f;
	}
	
	@Override 
	public void execute() 
	{
		f.afficheForme();
	}

}
