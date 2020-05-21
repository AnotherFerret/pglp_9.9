import formes.*;

public class Application {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle("r1", 3,2,1,1,5,5);
		Rectangle r2 = new Rectangle("r2", 30,20,10,10,50,50);
		Cercle c1 = new Cercle("c1", 5, 2,2,4,4);
		Carre cr1 = new Carre("c1", 5, 2,2,4,4);
		Triangle t1 = new Triangle("t1", 5,8,2,2,2,4,4);
		
		GroupeForme gf1 = new GroupeForme();
		GroupeForme gf2 = new GroupeForme();
		
		gf1.addForme(r1);
		gf1.addForme(r2);
		
		gf2.addForme(c1);
		gf2.addForme(cr1);
		gf2.addForme(t1);
		
		GroupeForme all = new GroupeForme();
		all.addForme(gf1);
		all.addForme(gf2);
		
		all.afficheForme();
	}

}
