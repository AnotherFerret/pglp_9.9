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
		
		public void addForme(Groupe p1)
		{
			formes.add(p1);
		}
		
		public void removeForme(Groupe p1)
		{
			formes.remove(p1);
		}
}
