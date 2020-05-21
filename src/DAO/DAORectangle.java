package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import formes.Rectangle;



public class DAORectangle extends DAO<Rectangle> {

	SQLConnexion SQLconnect = new SQLConnexion();
	Connection conn = SQLConnexion.getInstance();
	
	
	@Override
	public boolean create(Rectangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"INSERT INTO rectangle (id, type, x1, x2, y1, y2, longueur, largeur) VALUES(?, ?, ?, ?, ?, ?, ?, ?");
		
		prepare.setString(1, p.getId());
		prepare.setString(2, p.getType());
		prepare.setDouble(3, p.getx1());
		prepare.setDouble(4, p.getx2());
		prepare.setDouble(5, p.gety1());
		prepare.setDouble(6, p.gety2());
		prepare.setDouble(7, p.getLongueur());
		prepare.setDouble(8, p.getLargeur());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public Rectangle read(String id) throws SQLException {
		PreparedStatement prepare = conn.prepareStatement(
				"SELECT * FROM rectangle WHERE id = ?");
		prepare.setString(1, id);
		ResultSet result = prepare.executeQuery();
		
		Rectangle t = new Rectangle(result.getString("id"), result.getDouble("x1"), result.getDouble("x2"),  result.getDouble("y1"),  result.getDouble("y2"),  
				result.getDouble("longueur"),  result.getDouble("largeur"));
		
		conn.close();
		return t;
	}

	@Override
	public boolean update(Rectangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"UPDATE rectangle SET (x1, x2, y1, y2, longueur, largeur) VALUES(?,?,?,?,?,?) WHERE id = ?");
		
		prepare.setString(7, p.getId());
		prepare.setDouble(1, p.getx1());
		prepare.setDouble(2, p.getx2());
		prepare.setDouble(3, p.gety1());
		prepare.setDouble(4, p.gety2());
		prepare.setDouble(5, p.getLongueur());
		prepare.setDouble(6, p.getLargeur());
		
		prepare.executeUpdate();
		
		conn.close();
		return true;
	}

	@Override
	public boolean delete(Rectangle p) throws SQLException {
		
		PreparedStatement prepare = conn.prepareStatement(
				"DELETE FROM rectangle WHERE id = ?");
		prepare.setString(1, p.getId());
		return false;
	}
		
}
