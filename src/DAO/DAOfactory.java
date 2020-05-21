package DAO;

import formes.Carre;
import formes.Cercle;
import formes.Rectangle;
import formes.Triangle;

public class DAOfactory {

	public static DAO<Triangle> getDAOTriangle()
	{
		return new DAOTriangle();
	}
	public static DAO<Carre> getDAOCarre()
	{
		return new DAOCarre();
	}
	public static DAO<Cercle> getDAOCercle()
	{
		return new DAOCercle();
	}
	public static DAO<Rectangle> getDAORectangle()
	{
		return new DAORectangle();
	}
	
}
