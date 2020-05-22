package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import UI.AfficherFigureCommand;
import UI.Command;
import UI.CommandFactory;
import UI.DegrouperFigureCommand;
import UI.DeplacerFigureCommand;
import UI.DeplacerGroupCommand;
import UI.DrawingTUI;
import UI.GrouperFigureCommand;
import UI.PositionnerFigureCommand;
import formes.Carre;
import formes.Cercle;
import formes.GroupeForme;
import formes.Rectangle;
import formes.Triangle;

public class FormesTests {

	Rectangle rectangle1 = new Rectangle("r1", 3,2,1,5);
	Rectangle rectangle2 = new Rectangle("r2", 30,20,10,50);
	Cercle cercle1 = new Cercle("c1", 5, 2,4);
	Carre carre1 = new Carre("cr1", 20, 8,4);
	Triangle triangle1 = new Triangle("t1", 5,8,2,2,4);
	
	GroupeForme all = new GroupeForme();
	GroupeForme g1 = new GroupeForme();
	GroupeForme g2 = new GroupeForme();
	
	DrawingTUI dUI = new DrawingTUI();
	CommandFactory f = CommandFactory.init();
	
	@Before
	public void init()
	{
		g1.addForme(rectangle1);
		g1.addForme(rectangle2);
		g1.addForme(cercle1);
		g2.addForme(carre1);

		all.addForme(g1);
		all.addForme(g2);
		
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
	}
	
	@Test
	public void testAfficher() {
		f.executeCommand("afficher_g1");
		f.executeCommand("afficher_g2");
		f.executeCommand("afficher_all");
		System.out.print("=====AFFICHAGES=====");

	}
	
	@Test
	public void testDeplacer() {
		f.executeCommand("deplacer_r1");
		assertEquals(rectangle1.getx(), 5001.0, 0.0);
		assertEquals(rectangle1.gety(), 5005.0, 0.0);
		
		f.executeCommand("deplacer_r2");
		assertEquals(rectangle2.getx(), -4990.0, 0.0);
		assertEquals(rectangle2.gety(), -4950.0, 0.0);
		
		f.executeCommand("deplacer_g1");
		assertEquals(cercle1.getx(), 25002.0, 0.0);
		assertEquals(cercle1.gety(), 25004.0, 0.0);
	}
	
	@Test
	public void testGrouper() {
		f.executeCommand("grouper_g2_t1");
		f.executeCommand("afficher_g2");
		System.out.print("==triangle1 (t1) devrait s'afficher==\n\n");
		
	}
	
	@Test
	public void testDegrouper() {
		f.executeCommand("degrouper_cr1");
		f.executeCommand("afficher_g2");
		System.out.print("==cercle1 (c1) devrait ne pas s'afficher==\n\n");
	}
	
	@Test
	public void testPositionner() {
		f.executeCommand("positionner_r2");
		assertEquals(rectangle2.getx(), -50000.0, 0.0);
		assertEquals(rectangle2.gety(), -50000.0, 0.0);
	}

}
