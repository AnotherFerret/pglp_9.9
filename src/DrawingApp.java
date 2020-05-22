import UI.*;

import formes.*;

public class DrawingApp {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle("r1", 3,2,1,5);
		Rectangle rectangle2 = new Rectangle("r2", 30,20,10,50);
		Cercle cercle1 = new Cercle("c1", 5, 2,4);
		Carre carre1 = new Carre("cr1", 20, 8,4);
		Triangle triangle1 = new Triangle("t1", 5,8,2,2,4);
		
		GroupeForme all = new GroupeForme();
		GroupeForme g1 = new GroupeForme();
		GroupeForme g2 = new GroupeForme();
		
		g1.addForme(rectangle1);
		g1.addForme(rectangle2);
		g1.addForme(cercle1);
		g2.addForme(carre1);

		all.addForme(g1);
		all.addForme(g2);
		
		
		DrawingTUI dUI = new DrawingTUI();
		CommandFactory f = CommandFactory.init();
		
		Command aff_g1 = new AfficherFigureCommand(g1);
		Command aff_g2 = new AfficherFigureCommand(g2);
		Command deplacer_r1 = new DeplacerFigureCommand(rectangle1, 5000.0, 5000.0);
		Command deplacer_r2 = new DeplacerFigureCommand(rectangle2, -5000.0, -5000.0);
		Command aff_all = new AfficherFigureCommand(all);
		Command grouper_t1 = new GrouperFigureCommand(g2, triangle1);
		
		Command degrouper_cr1 = new DegrouperFigureCommand(g2, cercle1);
		Command positionner_r2 = new PositionnerFigureCommand(rectangle2, -50000, -50000);
		Command deplacer_g1 = new DeplacerGroupCommand(g1, 25000, 25000);
		
		
		f.addCommand("afficher_g1", aff_g1);
		f.addCommand("afficher_g2", aff_g2);
		f.addCommand("afficher_all", aff_all);
		
		f.addCommand("deplacer_r1", deplacer_r1);
		f.addCommand("deplacer_r2", deplacer_r2);
		f.addCommand("deplacer_g1", deplacer_g1);
		
		f.addCommand("grouper_g2_t1", grouper_t1);
		f.addCommand("degrouper_cr1", degrouper_cr1);
		
		f.addCommand("positionner_r2", positionner_r2);

		
		dUI.run(f);
	}

}
