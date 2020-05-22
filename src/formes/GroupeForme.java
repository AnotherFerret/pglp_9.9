package formes;

import java.util.HashSet;

public class GroupeForme implements Groupe {

	private HashSet<Groupe> formes = new HashSet<Groupe>();
		
		public void afficheForme()
		{
			for(Groupe f : formes)
			{
				f.afficheForme();
			}
		}
		
		public void bougeForme(double x, double y)
		{
			for(Groupe f : formes)
			{
				f.bougeForme(x, y);
			}
		}
		
		public void positionneForme(double x, double y)
		{
			for(Groupe f : formes)
			{
				f.positionneForme(x, y);
			}
		}
		
		public void addForme(Groupe p1)
		{
			formes.add(p1);
		}
		
		public void removeForme(Groupe p1)
		{
			formes.remove(p1);
		}

}
